package net.settlerstavern.tavern_core.client;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import net.settlerstavern.tavern_core.entity.custom.SitEntity;

public class SitEntityModel extends EntityModel<SitEntity> {

    private final ModelPart base;

    public SitEntityModel(ModelPart base) {
        this.base = base.getChild(EntityModelPartNames.CUBE);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData data = new ModelData();
        ModelPartData part = data.getRoot();
        part.addChild(EntityModelPartNames.CUBE, ModelPartBuilder.create().cuboid(-6f, 12f, 6f, 8f, 8f, 8f), ModelTransform.pivot(0, 0, 0));
        return TexturedModelData.of(data, 64, 64);
    }

    @Override
    public void setAngles(SitEntity entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.base).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
    }
}
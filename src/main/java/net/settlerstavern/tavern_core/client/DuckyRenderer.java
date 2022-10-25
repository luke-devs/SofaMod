package net.settlerstavern.tavern_core.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.settlerstavern.tavern_core.TavernCore;
import net.settlerstavern.tavern_core.entity.custom.DuckyEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DuckyRenderer extends GeoEntityRenderer<DuckyEntity> {
    public DuckyRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new DuckyModel());
    }

    @Override
    public Identifier getTextureResource(DuckyEntity object) {
        return new Identifier(TavernCore.MOD_ID, "textures/entity/duck/ducky.png");
    }

    @Override
    public RenderLayer getRenderType(DuckyEntity animatable, float partialTicks, MatrixStack stack, @Nullable VertexConsumerProvider renderTypeBuffer,
                                     @Nullable VertexConsumer vertexBuilder, int packedLightIn, Identifier textureLocation) {
        if (animatable.isBaby()){
            stack.scale(0.4f, 0.4f, 0.4f);
        }else{
            stack.scale(1, 1, 1);
        }
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}

package net.settlerstavern.tavern_core.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.settlerstavern.tavern_core.TavernCoreClient;
import net.settlerstavern.tavern_core.entity.custom.SitEntity;

public class SitEntityRenderer extends MobEntityRenderer<SitEntity, SitEntityModel> {

    public SitEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new SitEntityModel(context.getPart(TavernCoreClient.MODEL_SIT_ENTITY_LAYER)), 0);
    }

    @Override
    public Identifier getTexture(SitEntity entity) {
        return new Identifier("tavern_core", "textures/entity/sit_entity/sit_entity.png");
    }
}

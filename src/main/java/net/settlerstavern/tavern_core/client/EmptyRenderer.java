package net.settlerstavern.tavern_core.client;

import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.settlerstavern.tavern_core.entity.custom.SeatEntity;


public class EmptyRenderer extends EntityRenderer<SeatEntity> {

    public EmptyRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
    }

    @Override
    public boolean shouldRender(SeatEntity livingEntityIn, Frustum camera, double camX, double camY, double camZ) {
        return false;
    }

    @Override
    public Identifier getTexture(SeatEntity entity) {
        return null;
    }
}

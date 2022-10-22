package net.settlerstavern.entity;

import net.minecraft.util.SignType;
import net.settlerstavern.tavern_core.mixin.SignTypeAccessor;

public class ModSignTypes {
    public static final SignType MAPLE = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple"));
    public static final SignType WILLOW = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("willow"));
    public static final SignType SCULK = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("sculk"));
}

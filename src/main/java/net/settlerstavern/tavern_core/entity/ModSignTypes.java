package net.settlerstavern.tavern_core.entity;

import net.minecraft.util.SignType;
import net.settlerstavern.tavern_core.mixin.SignTypeAccessor;

public class ModSignTypes {
    public static final SignType MAPLE = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("maple"));
    public static final SignType WILLOW = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("willow"));
    public static final SignType EUCALYPTUS = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("eucalyptus"));
    public static final SignType SCULK = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("sculk"));
    public static final SignType CHERRY_BLOSSOM = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("cherry_blossom"));
    public static final SignType SILVERBELL = SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("silverbell"));
}

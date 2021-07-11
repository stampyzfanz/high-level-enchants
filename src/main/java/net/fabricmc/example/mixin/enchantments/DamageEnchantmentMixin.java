package net.fabricmc.example.mixin.enchantments;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import net.minecraft.enchantment;

@Mixin(DamageEnchantment.class)
public class DamageEnchantmentMixin {
	@Inject(method = "getMaxLevel", at = @At("RETURN"))
	private int getMaxLevel(CallbackInfo ci) {
    return 420;
	}
}

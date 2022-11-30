package hyperbolichippo.ultimatetech.mixin;

import hyperbolichippo.ultimatetech.UltimateTechMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class UltimateTechMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		UltimateTechMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}

package lausiv1024.noAttackCoolDown;

import net.minecraft.client.multiplayer.PlayerController;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {
    @SubscribeEvent
    public static void event(TickEvent.PlayerTickEvent event){
        event.player.attackStrengthTicker = 255;
    }
}

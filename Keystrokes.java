public class KeyStrokes extends Func {
    int x = 10;
    int y = 10;

    public KeyStrokes() {
        super(FuncType.Test, "Keystrokes Mod");
    }

    public static Minecraft mc = Minecraft.getInstance();
    @SubscribeEvent
    public void onRenderGameOverlay(RenderGameOverlayEvent e) {
        if (isToggled()) {
            if (e.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
                assert mc.player != null;
                mc.font.drawShadow(e.getMatrixStack(), "W", x + 10, y + 1, -1);
                mc.font.drawShadow(e.getMatrixStack(), "A", x + 1, y + 10, -1);
                mc.font.drawShadow(e.getMatrixStack(), "S", x + 10, y + 10, -1);
                mc.font.drawShadow(e.getMatrixStack(), "D", x + 20, y + 10, -1);
            }
        }
        if (KeyBoard.isKeyDown(GLFW.GLFW_KEY_W)) {
            if (e.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
                mc.font.drawShadow(e.getMatrixStack(), "W", x + 10, y + 1, RainbowUtil.rainbow(1, 1, 1).getRGB());
            }
        }
        if (KeyBoard.isKeyDown(GLFW.GLFW_KEY_A)) {
            if (e.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
                mc.font.drawShadow(e.getMatrixStack(), "A", x + 1, y + 10, RainbowUtil.rainbow(1, 1, 1).getRGB());
            }
        }
        if (KeyBoard.isKeyDown(GLFW.GLFW_KEY_S)) {
            if (e.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
                mc.font.drawShadow(e.getMatrixStack(), "S", x + 10, y + 10, RainbowUtil.rainbow(1, 1, 1).getRGB());
            }
        }
        if (KeyBoard.isKeyDown(GLFW.GLFW_KEY_D)) {
            if (e.getType() == RenderGameOverlayEvent.ElementType.TEXT) {
                mc.font.drawShadow(e.getMatrixStack(), "D", x + 20, y + 10, RainbowUtil.rainbow(1, 1, 1).getRGB());
            }
        }
    }
}

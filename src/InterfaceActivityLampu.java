import javax.swing.plaf.PanelUI;

public interface InterfaceActivityLampu {
    public static final int LAMPU_HIDUP = 1;
    public static final int LAMPU_MATI = 0;
    public static final int LAMPU_REDUP = 3;
    public abstract void matikanLampu();
    public abstract void hidupkanLampu();
    public abstract void redupkanLampu();
}

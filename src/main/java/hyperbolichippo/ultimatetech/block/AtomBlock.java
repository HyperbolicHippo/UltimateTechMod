package hyperbolichippo.ultimatetech.block;

import net.minecraft.block.Block;

public class AtomBlock extends Block {
    private int protons, electrons, neutrons;
    private boolean isIsotope = false;

    public AtomBlock(int protons, int electrons, Settings settings) {
        super(settings);
        this.protons = protons;
        this.electrons = electrons;
    }

    public AtomBlock isotope(int neutrons) {
        this.neutrons = neutrons;
        this.isIsotope = true;
        return this;
    }

    public int protons() {
        return protons;
    }

    public int electrons() {
        return electrons;
    }

    public int neutrons() {
        return neutrons;
    }

    public boolean isIsotope() {
        return isIsotope;
    }
}

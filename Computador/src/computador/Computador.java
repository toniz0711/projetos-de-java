package computador;

       public class Computador {           
           
           
    public void AdicionarComponente (ComponenteBase componente) {
        System.out.println("os componentes adicionados sao: " + componente.toString());
    }

    public static void main(String[] args) {
        Computador pc = new Computador();

        // Adicionando componentes ao computador        
        
        PlacaMae mobo = new PlacaMae(12, 15, "ASUS");
        pc.AdicionarComponente(mobo);

        Processador i5 = new Processador(12, 15, "Intel 15", 2.6, 1);
        pc.AdicionarComponente(i5);

        Fonte nfonte650 = new Fonte(12, 15, "Normal", 650);
        pc.AdicionarComponente(nfonte650);

        PlacaVideo rtx = new PlacaVideo(12, 15, "Nvidia RTX 4060", 8);
        pc.AdicionarComponente(rtx);

        Ssd samdisk = new Ssd(12, 15, "SamDisk", 600);
        pc.AdicionarComponente(samdisk);

        Ram pichau = new Ram(12, 15, "Pichau", 32);
        pc.AdicionarComponente(pichau);
    }
}

// Classe base para componentes
class ComponenteBase {
    public int voltagemVolts;
    public int potenciaWatts;
    public String modelo;

    public ComponenteBase(int voltagemVolts, int potenciaWatts, String modelo) {
        this.voltagemVolts = voltagemVolts;
        this.potenciaWatts = potenciaWatts;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return modelo + " " + voltagemVolts + "V " + potenciaWatts + "W";
    }

    // Getters e Setters
    public int getVoltagemVolts() {
        return voltagemVolts;
    }

    public void setVoltagemVolts(int voltagemVolts) {
        this.voltagemVolts = voltagemVolts;
    }

    public int getPotenciaWatts() {
        return potenciaWatts;
    }

    public void setPotenciaWatts(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

// Classe Processador
class Processador extends ComponenteBase {
    public double frequencia;
    public int cache;

    public Processador(int voltagemVolts, int potenciaWatts, String modelo, double frequencia, int cache) {
        super(voltagemVolts, potenciaWatts, modelo);
        this.frequencia = frequencia;
        this.cache = cache;
    }

    @Override
    public String toString() {
        return super.toString() + " " + frequencia + " GHz " + cache + " MB";
    }

    // Getters e Setters
    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }
}

// Classe PlacaMae
class PlacaMae extends ComponenteBase {
    public PlacaMae(int voltagemVolts, int potenciaWatts, String modelo) {
        super(voltagemVolts, potenciaWatts, modelo);
    }
}

// Classe Fonte
class Fonte extends ComponenteBase {
    public int volts;

    public Fonte(int voltagemVolts, int potenciaWatts, String modelo, int volts) {
        super(voltagemVolts, potenciaWatts, modelo);
        this.volts = volts;
    }

    @Override
    public String toString() {
        return super.toString() + " " + volts + "V";
    }

    // Getter e Setter
    public int getVolts() {
        return volts;
    }

    public void setVolts(int volts) {
        this.volts = volts;
    }
}

// Classe Ssd
class Ssd extends ComponenteBase {
    public int gb;

    public Ssd(int voltagemVolts, int potenciaWatts, String modelo, int gb) {
        super(voltagemVolts, potenciaWatts, modelo);
        this.gb = gb;
    }

    @Override
    public String toString() {
        return super.toString() + " " + gb + " GB";
    }

    // Getter e Setter
    public int getGb() {
        return gb;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }
}

// Classe Ram
class Ram extends ComponenteBase {
    public int gb;

    public Ram(int voltagemVolts, int potenciaWatts, String modelo, int gb) {
        super(voltagemVolts, potenciaWatts, modelo);
        this.gb = gb;
    }

    @Override
    public String toString() {
        return super.toString() + " " + gb + " GB de RAM";
    }

    // Getter e Setter
    public int getGb() {
        return gb;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }
}

// Classe PlacaVideo
class PlacaVideo extends ComponenteBase {
    public int vram;

    public PlacaVideo(int voltagemVolts, int potenciaWatts, String modelo, int vram) {
        super(voltagemVolts, potenciaWatts, modelo);
        this.vram = vram;
    }

    @Override
    public String toString() {
        return super.toString() + " " + vram + " GB VRAM";
    }

    // Getter e Setter
    public int getVram() {
        return vram;
    }

    public void setVram(int vram) {
        this.vram = vram;
    }
    public void componentes(ComponenteBase componente){
        System.out.println("os componentes são" + componente.toString());
    
    }
}

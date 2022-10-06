public class ComputadorBuilder {
    private Computador computador;

    public ComputadorBuilder(){
        computador = new Computador();
    }

    public Computador build(){
        //cpu gpu motherboard ram psu
        if(computador.getCpu() == ""){
            throw new IllegalArgumentException("CPU Incorreto");
        }
        if(computador.getGpu() == ""){
            throw new IllegalArgumentException("GPU Incorreto");
        }
        if(computador.getMotherboard() == ""){
            throw new IllegalArgumentException("Motherboard Incorreto");
        }
        if(computador.getRam() == ""){
            throw new IllegalArgumentException("RAM Incorreto");
        }
        if(computador.getPsu() == ""){
            throw new IllegalArgumentException("PSU Incorreto");
        }
        if(computador.getOwner() == null){
            throw new NullPointerException("Nome nao instanciado");
        }
        return computador;
    }

    public ComputadorBuilder setCpu(String cpu) {
        computador.setCpu(cpu);
        return this;
    }

    public ComputadorBuilder setGpu(String gpu) {
        computador.setGpu(gpu);
        return this;
    }

    public ComputadorBuilder setMotherboard(String motherboard) {
        computador.setMotherboard(motherboard);
        return this;
    }

    public ComputadorBuilder setRam(String ram) {
        computador.setRam(ram);
        return this;
    }

    public ComputadorBuilder setCooler(String cooler) {
        computador.setCooler(cooler);
        return this;
    }

    public ComputadorBuilder setPsu(String psu) {
        computador.setPsu(psu);
        return this;
    }

    public ComputadorBuilder setMonitor(String monitor) {
        computador.setMonitor(monitor);
        return this;
    }

    public ComputadorBuilder setKeyboard(String keyboard) {
        computador.setKeyboard(keyboard);
        return this;
    }

    public ComputadorBuilder setMouse(String mouse) {
        computador.setMouse(mouse);
        return this;
    }

    public ComputadorBuilder setHeadphone(String headphone) {
        computador.setHeadphone(headphone);
        return this;
    }

    public ComputadorBuilder setOwner(String owner) {
        computador.setOwner(owner);
        return this;
    }

}

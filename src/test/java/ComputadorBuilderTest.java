import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorBuilderTest {

    @Test
    void deveRetornarExcecaoParaCpu(){
        try{
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setGpu("GTX 1060")
                    .setMotherboard("ATX")
                    .setRam("16GB")
                    .setPsu("700W")
                    .setOwner("Henrique")
                    .build();
        fail();
        } catch (IllegalArgumentException e){
            assertEquals("CPU Incorreto", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaGpu(){
        try{
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setCpu("i5")
                    .setMotherboard("ATX")
                    .setRam("16GB")
                    .setPsu("700W")
                    .setOwner("Henrique")
                    .build();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("GPU Incorreto", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaMotherboard(){
        try{
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setCpu("i5")
                    .setGpu("GTX 1060")
                    .setRam("16GB")
                    .setPsu("700W")
                    .setOwner("Henrique")
                    .build();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Motherboard Incorreto", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaRam(){
        try{
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setCpu("i5")
                    .setGpu("GTX 1060")
                    .setMotherboard("ATX")
                    .setPsu("700W")
                    .setOwner("Henrique")
                    .build();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("RAM Incorreto", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPsu(){
        try{
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setCpu("i5")
                    .setGpu("GTX 1060")
                    .setRam("16GB")
                    .setMotherboard("ATX")
                    .setOwner("Henrique")
                    .build();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("PSU Incorreto", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaOwner(){
        try{
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setCpu("i5")
                    .setGpu("GTX 1060")
                    .setRam("16GB")
                    .setPsu("700W")
                    .setMotherboard("ATX")
                    .build();
            fail();
        } catch (NullPointerException e){
            assertEquals("Nome nao instanciado", e.getMessage());
        }
    }

    @Test
    void deveRetornarComputadorValido(){
            ComputadorBuilder computadorBuilder = new ComputadorBuilder();
            Computador computador = computadorBuilder
                    .setCpu("i5")
                    .setGpu("GTX 1060")
                    .setRam("16GB")
                    .setPsu("700W")
                    .setMotherboard("ATX")
                    .setOwner("Henrique")
                    .build();

            assertNotNull(computador);
    }

}
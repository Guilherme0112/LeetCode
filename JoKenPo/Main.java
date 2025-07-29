import java.util.Random;

class Main {

    private static final String[] SINAIS =  {"PEDRA", "PAPEL", "TESOURA"};

    public static void main(String[] args) {
        int maquina1 = new Random().nextInt(3);
        int maquina2 = new Random().nextInt(3);

        System.out.println(verificarResultado(SINAIS[maquina1], SINAIS[maquina2]));
    }

    public static String verificarResultado(String maquina1, String maquina2) {
        String[] resultado = {"GANHOU", "PERDEU", "EMPATOU"};

        System.out.println("Sua jogada: " + maquina1);
        System.out.println("Jogada da máquina: " + maquina2);

        if (maquina1.equals(maquina2)) return resultado[2];

        // Pedra
        if(maquina1.equals("PEDRA")){
            if(maquina2.equals("PAPEL")){
                return resultado[1];
            }
            if(maquina2.equals("TESOURA")){
                return resultado[0];
            }
        }

        // Papel
        if(maquina1.equals("PAPEL")){
            if(maquina2.equals("PEDRA")){
                return resultado[0];
            }
            if(maquina2.equals("TESOURA")){
                return resultado[1];
            }
        }

        // Tesoura
        if(maquina1.equals("TESOURA")){
            if(maquina2.equals("PEDRA")){
                return resultado[1];
            }
            if(maquina2.equals("PAPEL")){
                return resultado[0];
            }
        }

        return resultado[1];
    }
}
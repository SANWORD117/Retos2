public class Reto3 {

    public static void main(String[] args) {
        
        String[][] teclado = {{"Esc","","F1","F2","F3","F4","","F5","F6","F7","F8","","F9","F10","F11","F12"},
        {"º","1","2","3","4","5","6","7","8","9","0","?","¡","<--","",""},
        {"Tab","Q","W","E","R","T","Y","U","I","O","P","[","]","Intro","",""},
        {"Bloq","A","S","D","F","G","H","J","K","L","Ñ","{","}","","",""},
        {"Shift","<","Z","X","C","V","B","N","M",",",".","-","Shift","","",""},
        {"Ctrl","Win","Alt","","","","Spacebar","","","","Alt Gr","Win","Paper","Ctrl","",""}
    };
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 16; j++) {
                System.out.print(teclado[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}

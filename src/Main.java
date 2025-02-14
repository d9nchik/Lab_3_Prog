public class Main {

    public static void main(String[] args) {
        char[][] maze = ReadWrite.readFile("Test/file_labirint");
        int[] finish = new int[2];
        finish[0] = 18;
        finish[1] = 18;
        try {
            Queue path = AStar.findPath(maze, 1, 1, finish);

            char[][] finish_labirint = SetStep.stepInLabirint(maze, path);
            ReadWrite.outLabirint(finish_labirint, "Test/out_file");
        } catch (Exception ex) {
            ReadWrite.easterEgg("easterEggs/women.txt","Test/out_file");
        }
    }
}


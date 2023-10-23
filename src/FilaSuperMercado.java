import java.util.Arrays;
import java.util.Scanner;

public class FilaSuperMercado {
    private int maxSize;
    private int front;
    private int rear;
    private Cliente[] queue;

    Cliente c1 = new Cliente("Teste", 10);
    Scanner prompt = new Scanner(System.in);

    public FilaSuperMercado(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        queue = new Cliente[maxSize];
    }

    public Cliente[] getQueue() {
        return queue;
    }

    public void setQueue(Cliente[] queue) {
        this.queue = queue;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public void entrarNaFila () {
        if (isFull()) {
            System.out.println("A fila ta cheia");
        } else {
            System.out.println("Nome do cliente: ");
            c1.setNome(prompt.next());
            System.out.println("Quantidade de itens: ");
            c1.setNumeroDeItens(prompt.nextInt());
            queue[++rear] = c1;
        }
    }

    public Object atenderCliente () {
        if (isEmpty()) {
            System.out.println("A fila ta vazia!");
            return -1;
        } else {
            c1 = queue[front];
            for (int i = 0;i < rear;i++) {
                queue[i] = queue[i + 1];
            }
            //System.out.println("Cliente " + c1.getNome() + " foi atendido. Foram comprados " + c1.getNumeroDeItens() + " itens.");
            rear --;
            return c1;
        }
    }

    public int tamanhoDaFila() {
        return rear - front + 1;
    }
    public void fila() {
        System.out.println(Arrays.toString(queue));
    }
}

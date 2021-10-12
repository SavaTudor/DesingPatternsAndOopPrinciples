package containers;

import modules.Task;

/*
5.2. QueueContainer -
- care implementeazǎ, folosind o reprezentare pe un array, o strategie de tip FIFO;
 */
public class QueueContainer extends AbstractContainer {
    //Clasa va implementa o coada
    //Adica adaugarea se va face pe pozitia size
    //iar cand scoatem un element, il luam de pe pozitia 0

    public QueueContainer() {
        super();
    }

    @Override
    public Task remove() {
        if (!isEmpty()) {
            Task rez = tasks[0];
            System.arraycopy(tasks, 1, tasks, 0, tasks.length - 1);
            size--;
            return rez;
        }
        return null;
    }
}

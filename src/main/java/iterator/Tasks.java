package iterator;

/**
 * Created by troll on 08.08.2017.
 */
public class Tasks implements Container{
    String[] tasks = {"Build house", "Born son", "Get tree"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator{

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < tasks.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            return tasks[index++];
        }
    }
}

package deqo_mmon;

import java.util.EmptyStackException;

/**
 * Created by Manu on 07/11/2016.
 * Un commentaire répondant à l'exigence #3
 */
public class SimpleStackImpl implements SimpleStack {
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public void push(Item item) {

    }

    @Override
    public Item peek() throws EmptyStackException {
        return null;
    }

    @Override
    public Item pop() throws EmptyStackException {
        return null;
    }
}

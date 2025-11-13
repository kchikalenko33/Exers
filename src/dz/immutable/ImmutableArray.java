package dz.immutable;

public class ImmutableArray {
    private final int[] array;

    public  ImmutableArray(int[] array) {
        this.array = array.clone();
    }

    public int[] getArray() {
        return array.clone();
    }
}


package netology.task4_4_1;

import java.util.Set;
import java.util.TreeSet;

public class WishService {
    private Set<Wish> wishSet = new TreeSet<>(new WishComparatorPriorityAsc());

    public void add(Wish wish) {
        wishSet.add(wish);
    }

    public void sortPriceAsc() {
        Set<Wish> newWishSet = new TreeSet<>(new WishComparatorPriceAsc());

        newWishSet.addAll(wishSet);
        wishSet = newWishSet;
    }

    public void sortPriceDesc() {
        Set<Wish> newWishSet = new TreeSet<>(new WishComparatorPriceDesc());

        newWishSet.addAll(wishSet);
        wishSet = newWishSet;
    }

    public void sortPriorityAsc() {
        Set<Wish> newWishSet = new TreeSet<>(new WishComparatorPriorityAsc());

        newWishSet.addAll(wishSet);
        wishSet = newWishSet;
    }

    public void sortPriorityDesc() {
        Set<Wish> newWishSet = new TreeSet<>(new WishComparatorPriorityDesc());

        newWishSet.addAll(wishSet);
        wishSet = newWishSet;
    }

    public Set<Wish> getWishList() {
        return wishSet;
    }
}

package s106ex;


import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertThrows;


//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//class MyListTest {
//    private MyList myList;
//
//    @BeforeEach
//    private void init() {
//        myList = new MyList();
//    }

//    @Test
//    void emptyList() {
//        assertThat(myList.size(), is(0));
//    }
//
//    @Test
//    void addOne() {
//        myList.add(42);
//
//
//
//        assertThat(myList.size(), is(1));
//
//    }
//
//
//
//    @Test
//
//    void addThree() {
//
//        myList.add(42);
//
//        myList.add(Integer.MIN_VALUE);
//
//        myList.add(0);
//
//
//
//        assertThat(myList.size(), is(3));
//
//    }
//
//
//
//    @Test
//
//    void getEmpty() {
//
//        assertThrows(NullPointerException.class, () -> myList.get());
//
//    }
//
//
//
//    @Test
//
//    void getEmptyClassic() {
//
//        try {
//
//            myList.get();
//
//            fail("A NullPointerException was expected here");
//
//        } catch (NullPointerException npe) {
//
//        }
//
//    }
//
//
//
//    @Test
//
//    void getOne() {
//
//        myList.add(42);
//
//
//
//        assertThat(myList.get(), is(42));
//
//    }
//
//
//
//    @Test
//
//    void popEmpty() {
//
//        assertThrows(NullPointerException.class, () -> myList.pop());
//
//    }
//
//
//
//    @Test
//
//    void popOne() {
//
//        myList.add(42);
//
//        myList.pop();
//
//        assertThat(myList.size(), is(0));
//
//    }
//
//
//
//    @Test
//
//    void getAfterPop() {
//
//        myList.add(42);
//
//        myList.add(12);
//
//        myList.pop();
//
//
//
//        assertThat(myList.get(), is(12));
//
//    }
//
//}
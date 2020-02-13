import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    void test_Search_Node_When_Present_In_Left(){
        BinarySearchTree bt = new BinarySearchTree();
        insert_Bt(bt);
        assertTrue(bt.search(3));
    }

    @Test
    void test_Search_Node_When_Present_In_Right(){
        BinarySearchTree bt = new BinarySearchTree();
        insert_Bt(bt);
        assertTrue(bt.search(30));
    }

    @Test
    void test_Search_Node_When_Present_In_root(){
        BinarySearchTree bt = new BinarySearchTree();
        insert_Bt(bt);
        assertTrue(bt.search(10));
    }

    @Test
    void test_Search_Node_When_Missing_From_Right(){
        BinarySearchTree bt = new BinarySearchTree();
        insert_Bt(bt);
        assertFalse(bt.search(60));
    }

    @Test
    void test_Search_Node_When_Missing_From_Left(){
        BinarySearchTree bt = new BinarySearchTree();
        insert_Bt(bt);
        assertFalse(bt.search(0));
    }

    @Test
    void test_Remove_Root_Only_Node(){
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(10);
        assertEquals(Collections.singletonList(10),bt.traverse());
        bt.delete(10);
        assertEquals(Collections.emptyList(),bt.traverse());
    }

    @Test
    void test_Remove_Root_Node_Left_Child_Non_Null(){
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(10);
        bt.insert(5);
        bt.insert(3);
        assertEquals(Arrays.asList(3,5,10),bt.traverse());
        bt.delete(10);
        assertEquals(Arrays.asList(3,5),bt.traverse());
    }

    @Test
    void test_Remove_Root_Node_Right_Child_Non_Null(){
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(25);
        bt.insert(30);
        assertEquals(Arrays.asList(10,20,25,30),bt.traverse());
        bt.delete(10);
        assertEquals(Arrays.asList(20,25,30),bt.traverse());
    }

    @Test
    void test_Remove_Root_Node_With_Both_Child_Non_Null(){
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(15);
        bt.insert(17);
        bt.insert(30);
        bt.insert(5);
        bt.insert(3);
        assertEquals(Arrays.asList(3,5,10,15,17,20,30),bt.traverse());
        bt.delete(10);
        assertEquals(Arrays.asList(3,5,15,17,20,30),bt.traverse());
    }

    @Test
    void test_Remove_Node_From_Right_Tree_With_Zero_Child(){
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(5);
        assertEquals(Arrays.asList(5,10,20),bt.traverse());
        bt.delete(20);
        assertEquals(Arrays.asList(5,10),bt.traverse());
    }

    @Test
    void test_Remove_Node_From_Left_Tree_With_Zero_Child(){
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(5);
        assertEquals(Arrays.asList(5,10,20),bt.traverse());
        bt.delete(5);
        assertEquals(Arrays.asList(10,20),bt.traverse());
    }


    @Test
    void test_Remove_Node_From_Right_Tree_With_One_Child(){
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
        bt.insert(15);
        bt.insert(17);
        bt.insert(5);
        bt.insert(3);
        assertEquals(Arrays.asList(3,5,10,15,17,20,30),bt.traverse());
        bt.delete(15);
        assertEquals(Arrays.asList(3,5,10,17,20,30),bt.traverse());
    }

    @Test
    void test_Remove_Node_From_Left_Tree_With_One_Child(){
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(20);
        bt.insert(30);
        bt.insert(10);
        bt.insert(15);
        bt.insert(5);
        bt.insert(3);
        assertEquals(Arrays.asList(3,5,10,15,20,30),bt.traverse());
        bt.delete(5);
        assertEquals(Arrays.asList(3,10,15,20,30),bt.traverse());
    }

    @Test
    void test_Remove_Node_From_Right_Tree_With_Two_Child(){
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
        bt.insert(15);
        bt.insert(17);
        bt.insert(5);
        bt.insert(3);
        assertEquals(Arrays.asList(3,5,10,15,17,20,30),bt.traverse());
        bt.delete(20);
        assertEquals(Arrays.asList(3,5,10,15,17,30),bt.traverse());
    }


    @Test
    void test_Remove_Node_From_Left_Tree_With_Two_Child(){
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(20);
        bt.insert(30);
        bt.insert(10);
        bt.insert(15);
        bt.insert(5);
        bt.insert(12);
        bt.insert(14);
        bt.insert(17);
        assertEquals(Arrays.asList(5,10,12,14,15,17,20,30),bt.traverse());
        bt.delete(10);
        assertEquals(Arrays.asList(5,12,14,15,17,20,30),bt.traverse());
    }

    @Test
    void test_insert_one_node() {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(10);
        assertEquals(Collections.singletonList(10),bt.traverse());
    }

    @Test
    void test_insert_two_node() {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(10);
        bt.insert(20);
        assertEquals(Arrays.asList(10,20),bt.traverse());
    }

    @Test
    void test_insert_three_node() {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(10);
        bt.insert(20);
        bt.insert(5);
        assertEquals(Arrays.asList(5,10,20),bt.traverse());
    }


    @Test
    void test_insert_many_random_node() {
        BinarySearchTree bt =new BinarySearchTree();
        insert_Bt(bt);
        assertEquals(Arrays.asList(3,5,10,20,25,30),bt.traverse());
    }

    //          10
    //      5        20
    //3                    25
    //                           30

    private void insert_Bt(BinarySearchTree bt){
        bt.insert(10);
        bt.insert(20);
        bt.insert(5);
        bt.insert(25);
        bt.insert(30);
        bt.insert(3);
    }

    @Test
    public void test_Unbalanced_Tree_TraverseBFS(){
        BinarySearchTree bt = new BinarySearchTree();
        insert_Bt(bt);
        assertEquals(Arrays.asList(10,5,20,3,25,30),bt.traverseBFS());
        bt.delete(3);
        assertEquals(Arrays.asList(10,5,20,25,30),bt.traverseBFS());
    }

}
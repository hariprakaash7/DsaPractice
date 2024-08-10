package algorithms.dsa;


import dsa.PreOrderToBst;
import org.junit.jupiter.api.Test;

public class PreOrderToBstTest {

    @Test
    void shouldConvertInorderArrayToBst() {
        int [] a = {10,5,1,7,40,50};
        PreOrderToBst inorderToBst = new PreOrderToBst(a);
        inorderToBst.calculateTree();
        inorderToBst.inorderRec();
    }
}

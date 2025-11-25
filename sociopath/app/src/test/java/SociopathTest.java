import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class SociopathTest {
    
    @Test
    public void testCase1_BasicSociopath() {
        Sociopath sociopath = new Sociopath();
        int groupSize = 2;
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        int result = sociopath.findTheSociopath(groupSize, likeList);
        assertEquals(2, result);
    }
    
    @Test
    public void testCase2_NoOneLikesThree() {
        Sociopath sociopath = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        int result = sociopath.findTheSociopath(3, likeList);
        assertEquals(-1, result);
    }
    
    @Test
    public void testCase3_EveryoneLikesThree() {
        Sociopath sociopath = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        likeList.add(new int[]{1, 3});
        likeList.add(new int[]{2, 3});
        int result = sociopath.findTheSociopath(3, likeList);
        assertEquals(3, result);
    }
    
    @Test
    public void testCase4_EveryoneLikesSomeone() {
        Sociopath sociopath = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 3});
        likeList.add(new int[]{2, 3});
        likeList.add(new int[]{3, 1});
        int result = sociopath.findTheSociopath(3, likeList);
        assertEquals(-1, result);
    }
    
    @Test
    public void testCase5_InvalidGroupSize() {
        Sociopath sociopath = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 2});
        int result = sociopath.findTheSociopath(0, likeList);
        assertEquals(-1, result);
    }
    
    @Test
    public void testCase6_ZeroIsNotAPerson() {
        Sociopath sociopath = new Sociopath();
        List<int[]> likeList = new ArrayList<>();
        likeList.add(new int[]{1, 0});
        int result = sociopath.findTheSociopath(3, likeList);
        assertEquals(-1, result);
    }
}
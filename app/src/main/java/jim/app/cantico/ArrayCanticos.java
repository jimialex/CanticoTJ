package jim.app.cantico;

import android.util.SparseArray;

/**
 * Created by axel on 22-10-14.
 */
public class ArrayCanticos {

    private SparseArray<Cantico> array = new SparseArray<Cantico>();

    public void llenar(){
        array.put(0, new Cantico("Cantico 1", "verso 1", "laksdbfj jasdfjh asd kjabdfjkha d kjabsfdjh"));
        array.put(1, new Cantico("Cantico 2", "verso 2", "laksdbfj jasdfjh asd kjabdfjkha d kjabsfdjh"));
        array.put(2, new Cantico("Cantico 3", "verso 3", "laksdbfj jasdfjh asd kjabdfjkha d kjabsfdjh"));
    }
}

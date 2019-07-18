import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class yGa<T, R>
  implements DRa<Object[], R>
{
  public static final yGa a = new yGa();
  
  public final List<FGa.b> a(Object[] paramArrayOfObject)
  {
    oXa.b(paramArrayOfObject, "it");
    ArrayList localArrayList = new ArrayList(paramArrayOfObject.length);
    int i = paramArrayOfObject.length;
    int j = 0;
    while (j < i)
    {
      Object localObject = paramArrayOfObject[j];
      if (localObject != null)
      {
        localArrayList.add((FGa.b)localObject);
        j++;
      }
      else
      {
        throw new _Va("null cannot be cast to non-null type io.faceapp.ui.layouts.stylist.viewer_old.StylistOldView.PartStatus");
      }
    }
    return localArrayList;
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/yGa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
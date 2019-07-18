import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class vy
  extends uy<FieldDescriptorType, Object>
{
  vy(int paramInt)
  {
    super(paramInt, null);
  }
  
  public final void b()
  {
    if (!a())
    {
      for (int i = 0; i < c(); i++)
      {
        localObject = b(i);
        if (((nx)((Map.Entry)localObject).getKey()).r()) {
          ((Map.Entry)localObject).setValue(Collections.unmodifiableList((List)((Map.Entry)localObject).getValue()));
        }
      }
      Object localObject = d().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        if (((nx)localEntry.getKey()).r()) {
          localEntry.setValue(Collections.unmodifiableList((List)localEntry.getValue()));
        }
      }
    }
    super.b();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/vy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
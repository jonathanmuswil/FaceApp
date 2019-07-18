import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

class ae$a
  extends Zd.b
{
  int[][] J;
  
  ae$a(a parama, ae paramae, Resources paramResources)
  {
    super(parama, paramae, paramResources);
    if (parama != null) {
      this.J = parama.J;
    } else {
      this.J = new int[c()][];
    }
  }
  
  int a(int[] paramArrayOfInt)
  {
    int[][] arrayOfInt = this.J;
    int i = d();
    for (int j = 0; j < i; j++) {
      if (StateSet.stateSetMatches(arrayOfInt[j], paramArrayOfInt)) {
        return j;
      }
    }
    return -1;
  }
  
  int a(int[] paramArrayOfInt, Drawable paramDrawable)
  {
    int i = a(paramDrawable);
    this.J[i] = paramArrayOfInt;
    return i;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    super.a(paramInt1, paramInt2);
    int[][] arrayOfInt = new int[paramInt2][];
    System.arraycopy(this.J, 0, arrayOfInt, 0, paramInt1);
    this.J = arrayOfInt;
  }
  
  void m()
  {
    Object localObject = this.J;
    int[][] arrayOfInt = new int[localObject.length][];
    for (int i = localObject.length - 1; i >= 0; i--)
    {
      localObject = this.J;
      if (localObject[i] != null) {
        localObject = (int[])localObject[i].clone();
      } else {
        localObject = null;
      }
      arrayOfInt[i] = localObject;
    }
    this.J = arrayOfInt;
  }
  
  public Drawable newDrawable()
  {
    return new ae(this, null);
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    return new ae(this, paramResources);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ae$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
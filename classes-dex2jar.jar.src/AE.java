import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

class ae
  extends Zd
{
  private ae.a n;
  private boolean o;
  
  ae(ae.a parama)
  {
    if (parama != null) {
      a(parama);
    }
  }
  
  ae(ae.a parama, Resources paramResources)
  {
    a(new ae.a(parama, this, paramResources));
    onStateChange(getState());
  }
  
  ae.a a()
  {
    return new ae.a(this.n, this, null);
  }
  
  protected void a(Zd.b paramb)
  {
    super.a(paramb);
    if ((paramb instanceof ae.a)) {
      this.n = ((ae.a)paramb);
    }
  }
  
  int[] a(AttributeSet paramAttributeSet)
  {
    int i = paramAttributeSet.getAttributeCount();
    int[] arrayOfInt = new int[i];
    int j = 0;
    int i1;
    for (int k = 0; j < i; k = i1)
    {
      int m = paramAttributeSet.getAttributeNameResource(j);
      i1 = k;
      if (m != 0)
      {
        i1 = k;
        if (m != 16842960)
        {
          i1 = k;
          if (m != 16843161)
          {
            if (paramAttributeSet.getAttributeBooleanValue(j, false)) {
              i1 = m;
            } else {
              i1 = -m;
            }
            arrayOfInt[k] = i1;
            i1 = k + 1;
          }
        }
      }
      j++;
    }
    return StateSet.trimStateSet(arrayOfInt, k);
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    super.applyTheme(paramTheme);
    onStateChange(getState());
  }
  
  public boolean isStateful()
  {
    return true;
  }
  
  public Drawable mutate()
  {
    if (!this.o)
    {
      super.mutate();
      this.n.m();
      this.o = true;
    }
    return this;
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    boolean bool = super.onStateChange(paramArrayOfInt);
    int i = this.n.a(paramArrayOfInt);
    int j = i;
    if (i < 0) {
      j = this.n.a(StateSet.WILD_CARD);
    }
    if ((!a(j)) && (!bool)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  static class a
    extends Zd.b
  {
    int[][] J;
    
    a(a parama, ae paramae, Resources paramResources)
    {
      super(paramae, paramResources);
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
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
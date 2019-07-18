package io.faceapp.ui.misc;

public enum k
{
  public static final a d = new a(null);
  
  static
  {
    k localk1 = new k("FREE", 0);
    a = localk1;
    k localk2 = new k("PRO", 1);
    b = localk2;
    c = new k[] { localk1, localk2 };
  }
  
  private k() {}
  
  public static final class a
  {
    public final k a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      if ((!paramBoolean1) && (paramBoolean2))
      {
        k localk;
        if (paramBoolean3) {
          localk = k.a;
        } else {
          localk = k.b;
        }
        return localk;
      }
      return k.a;
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/misc/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
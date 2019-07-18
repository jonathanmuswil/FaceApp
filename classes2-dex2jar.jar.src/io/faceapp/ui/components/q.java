package io.faceapp.ui.components;

import Rja;
import oXa;

public abstract interface q
{
  public abstract void a(Rja paramRja, int paramInt);
  
  public static final class a
  {
    private final q a;
    private final int b;
    
    public a(q paramq, int paramInt)
    {
      this.a = paramq;
      this.b = paramInt;
    }
    
    public final void a(Rja paramRja)
    {
      oXa.b(paramRja, "image");
      this.a.a(paramRja, this.b);
    }
    
    public boolean equals(Object paramObject)
    {
      if (this != paramObject)
      {
        if ((paramObject instanceof a))
        {
          paramObject = (a)paramObject;
          if (oXa.a(this.a, ((a)paramObject).a))
          {
            int i;
            if (this.b == ((a)paramObject).b) {
              i = 1;
            } else {
              i = 0;
            }
            if (i != 0) {
              break label58;
            }
          }
        }
        return false;
      }
      label58:
      return true;
    }
    
    public int hashCode()
    {
      q localq = this.a;
      int i;
      if (localq != null) {
        i = localq.hashCode();
      } else {
        i = 0;
      }
      return i * 31 + this.b;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Info(listener=");
      localStringBuilder.append(this.a);
      localStringBuilder.append(", requestCode=");
      localStringBuilder.append(this.b);
      localStringBuilder.append(")");
      return localStringBuilder.toString();
    }
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/io/faceapp/ui/components/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
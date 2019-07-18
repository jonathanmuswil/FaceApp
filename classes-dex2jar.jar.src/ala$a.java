import android.view.View;

final class ala$a
{
  private final View a;
  private final Runnable b;
  
  public ala$a(View paramView, Runnable paramRunnable)
  {
    this.a = paramView;
    this.b = paramRunnable;
  }
  
  public final View a()
  {
    return this.a;
  }
  
  public final Runnable b()
  {
    return this.b;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject) {
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((oXa.a(this.a, ((a)paramObject).a)) && (oXa.a(this.b, ((a)paramObject).b))) {}
      }
      else
      {
        return false;
      }
    }
    return true;
  }
  
  public int hashCode()
  {
    Object localObject = this.a;
    int i = 0;
    int j;
    if (localObject != null) {
      j = localObject.hashCode();
    } else {
      j = 0;
    }
    localObject = this.b;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("PostDelayInfo(view=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", action=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/ala$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
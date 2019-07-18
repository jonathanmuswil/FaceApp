import android.support.v7.widget.RecyclerView.x;

class aHa$a
{
  public RecyclerView.x a;
  public RecyclerView.x b;
  public int c;
  public int d;
  public int e;
  public int f;
  
  private aHa$a(RecyclerView.x paramx1, RecyclerView.x paramx2)
  {
    this.a = paramx1;
    this.b = paramx2;
  }
  
  private aHa$a(RecyclerView.x paramx1, RecyclerView.x paramx2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this(paramx1, paramx2);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("ChangeInfo{oldHolder=");
    localStringBuilder.append(this.a);
    localStringBuilder.append(", newHolder=");
    localStringBuilder.append(this.b);
    localStringBuilder.append(", fromX=");
    localStringBuilder.append(this.c);
    localStringBuilder.append(", fromY=");
    localStringBuilder.append(this.d);
    localStringBuilder.append(", toX=");
    localStringBuilder.append(this.e);
    localStringBuilder.append(", toY=");
    localStringBuilder.append(this.f);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/aHa$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
import android.database.Cursor;

public class yW$b
{
  static final vW<Cursor> a = new zW();
  private final mW b;
  private final DW c;
  private vW<Cursor> d;
  
  yW$b(mW parammW, DW paramDW)
  {
    this.b = parammW;
    this.c = paramDW;
  }
  
  public yW a()
  {
    if (this.d == null) {
      this.d = a;
    }
    return new yW(this.b, this.d, this.c);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/yW$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
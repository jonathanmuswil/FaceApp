import java.nio.ByteBuffer;
import java.util.Queue;

class fi$b
{
  private final Queue<Ue> a = Pj.a(0);
  
  Ue a(ByteBuffer paramByteBuffer)
  {
    try
    {
      Ue localUe1 = (Ue)this.a.poll();
      Ue localUe2 = localUe1;
      if (localUe1 == null)
      {
        localUe2 = new Ue;
        localUe2.<init>();
      }
      localUe2.a(paramByteBuffer);
      return localUe2;
    }
    finally {}
  }
  
  void a(Ue paramUe)
  {
    try
    {
      paramUe.a();
      this.a.offer(paramUe);
      return;
    }
    finally
    {
      paramUe = finally;
      throw paramUe;
    }
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/fi$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
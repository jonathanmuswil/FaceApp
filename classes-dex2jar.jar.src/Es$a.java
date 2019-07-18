public class Es$a<MessageType extends Es<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  extends Rr<MessageType, BuilderType>
{
  private final MessageType a;
  protected MessageType b;
  protected boolean c;
  
  protected Es$a(MessageType paramMessageType)
  {
    this.a = paramMessageType;
    this.b = ((Es)paramMessageType.a(Es.e.d, null, null));
    this.c = false;
  }
  
  private static void a(MessageType paramMessageType1, MessageType paramMessageType2)
  {
    ut.a().a(paramMessageType1).b(paramMessageType1, paramMessageType2);
  }
  
  public final BuilderType a(MessageType paramMessageType)
  {
    b();
    a(this.b, paramMessageType);
    return this;
  }
  
  protected void b()
  {
    if (this.c)
    {
      Es localEs = (Es)this.b.a(Es.e.d, null, null);
      a(localEs, this.b);
      this.b = localEs;
      this.c = false;
    }
  }
  
  public MessageType c()
  {
    if (this.c) {
      return this.b;
    }
    Es localEs = this.b;
    ut.a().a(localEs).g(localEs);
    this.c = true;
    return this.b;
  }
  
  public final MessageType d()
  {
    Es localEs1 = (Es)K();
    boolean bool1 = Boolean.TRUE.booleanValue();
    int i = ((Byte)localEs1.a(Es.e.a, null, null)).byteValue();
    int j = 1;
    if (i != 1) {
      if (i == 0)
      {
        j = 0;
      }
      else
      {
        boolean bool2 = ut.a().a(localEs1).f(localEs1);
        j = bool2;
        if (bool1)
        {
          i = Es.e.b;
          Es localEs2;
          if (bool2) {
            localEs2 = localEs1;
          } else {
            localEs2 = null;
          }
          localEs1.a(i, localEs2, null);
          j = bool2;
        }
      }
    }
    if (j != 0) {
      return localEs1;
    }
    throw new Qt(localEs1);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/Es$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
public class sx$a<MessageType extends sx<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  extends Jw<MessageType, BuilderType>
{
  private final MessageType a;
  protected MessageType b;
  private boolean c;
  
  protected sx$a(MessageType paramMessageType)
  {
    this.a = paramMessageType;
    this.b = ((sx)paramMessageType.a(sx.d.d, null, null));
    this.c = false;
  }
  
  private static void a(MessageType paramMessageType1, MessageType paramMessageType2)
  {
    oy.a().a(paramMessageType1).b(paramMessageType1, paramMessageType2);
  }
  
  public final BuilderType a(MessageType paramMessageType)
  {
    d();
    a(this.b, paramMessageType);
    return this;
  }
  
  protected final void d()
  {
    if (this.c)
    {
      sx localsx = (sx)this.b.a(sx.d.d, null, null);
      a(localsx, this.b);
      this.b = localsx;
      this.c = false;
    }
  }
  
  public MessageType e()
  {
    if (this.c) {
      return this.b;
    }
    sx localsx = this.b;
    oy.a().a(localsx).d(localsx);
    this.c = true;
    return this.b;
  }
  
  public final MessageType f()
  {
    sx localsx = (sx)L();
    if (localsx.isInitialized()) {
      return localsx;
    }
    throw new Jy(localsx);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/sx$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
public class kI$a<MessageType extends kI<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  extends tH<MessageType, BuilderType>
{
  private final MessageType a;
  protected MessageType b;
  private boolean c;
  
  protected kI$a(MessageType paramMessageType)
  {
    this.a = paramMessageType;
    this.b = ((kI)paramMessageType.a(kI.e.d, null, null));
    this.c = false;
  }
  
  private static void a(MessageType paramMessageType1, MessageType paramMessageType2)
  {
    eJ.a().a(paramMessageType1).b(paramMessageType1, paramMessageType2);
  }
  
  public final BuilderType a(MessageType paramMessageType)
  {
    f();
    a(this.b, paramMessageType);
    return this;
  }
  
  protected final void f()
  {
    if (this.c)
    {
      kI localkI = (kI)this.b.a(kI.e.d, null, null);
      a(localkI, this.b);
      this.b = localkI;
      this.c = false;
    }
  }
  
  public MessageType g()
  {
    if (this.c) {
      return this.b;
    }
    this.b.h();
    this.c = true;
    return this.b;
  }
  
  public final MessageType h()
  {
    kI localkI = (kI)H();
    if (localkI.isInitialized()) {
      return localkI;
    }
    throw new AJ(localkI);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/kI$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
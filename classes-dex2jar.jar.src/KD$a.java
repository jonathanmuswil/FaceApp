public class KD$a<MessageType extends KD<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  extends YC<MessageType, BuilderType>
{
  private final MessageType a;
  private MessageType b;
  private boolean c;
  
  protected KD$a(MessageType paramMessageType)
  {
    this.a = paramMessageType;
    this.b = ((KD)paramMessageType.a(KD.e.d, null, null));
    this.c = false;
  }
  
  private static void a(MessageType paramMessageType1, MessageType paramMessageType2)
  {
    BE.a().a(paramMessageType1).b(paramMessageType1, paramMessageType2);
  }
  
  public final BuilderType a(MessageType paramMessageType)
  {
    if (this.c)
    {
      KD localKD = (KD)this.b.a(KD.e.d, null, null);
      a(localKD, this.b);
      this.b = localKD;
      this.c = false;
    }
    a(this.b, paramMessageType);
    return this;
  }
  
  public MessageType d()
  {
    if (this.c) {
      return this.b;
    }
    this.b.d();
    this.c = true;
    return this.b;
  }
  
  public final MessageType e()
  {
    KD localKD = (KD)G();
    if (localKD.isInitialized()) {
      return localKD;
    }
    throw new ZE(localKD);
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/KD$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
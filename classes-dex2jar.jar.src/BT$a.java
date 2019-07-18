public abstract class BT$a<MessageType extends BT<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>>
  implements VT.a
{
  protected static gU b(VT paramVT)
  {
    return new gU(paramVT);
  }
  
  protected abstract BuilderType a(MessageType paramMessageType);
  
  public BuilderType a(VT paramVT)
  {
    if (a().getClass().isInstance(paramVT))
    {
      a((BT)paramVT);
      return this;
    }
    throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
  }
}


/* Location:              /Applications/dex2jar/classes-dex2jar.jar!/BT$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
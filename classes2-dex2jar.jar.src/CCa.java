public final class cCa
  extends _Ba
{
  public cCa(float[] paramArrayOfFloat)
  {
    super("\n#ifdef GL_ES\nprecision mediump float;\n#endif\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\n\nuniform mat4 colorMatrix;\nuniform lowp float intensity;\n\nvoid main()\n{\n    vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n    vec4 resultColor = textureColor * colorMatrix;\n\n    gl_FragColor = mix(textureColor, resultColor, intensity);\n}\n", new String[] { "colorMatrix" }, 0, 4, null);
    a("colorMatrix", paramArrayOfFloat);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/cCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
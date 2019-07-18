public final class gCa
  extends _Ba
{
  public gCa()
  {
    super("\n#ifdef GL_ES\nprecision mediump float;\n#endif\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture;\nuniform lowp float intensity;\n\nconst vec3 W = vec3(0.2125, 0.7154, 0.0721);\nconst vec3 SEP1 = vec3(53./255., 0., 0.);\nconst vec3 SEP2 = vec3(252./255., 244./255., 197./255.);\n\nvoid main()\n{\n    vec3  tex  = texture2D(inputImageTexture, textureCoordinate).rgb;\n\n    float lum = mix(0.5, dot(tex, W), 1.4);\n    float grd = min(0.5 + sin(textureCoordinate.t * 3.1415), 1.);\n\n    vec3 resultColor = mix(SEP1, SEP2, lum * grd);\n    gl_FragColor = vec4((intensity * resultColor) + ((1.0 - intensity) * tex), 1.0);\n}\n", new String[0], 0, 4, null);
  }
}


/* Location:              /Applications/dex2jar/classes2-dex2jar.jar!/gCa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
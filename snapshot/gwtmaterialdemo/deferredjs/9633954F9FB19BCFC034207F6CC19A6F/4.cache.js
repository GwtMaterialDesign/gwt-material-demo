$wnd.gwtmaterialdemo.runAsyncCallback4("function $clinit_MaterialIconMorph(){\n  $clinit_MaterialIconMorph = emptyMethod;\n  !startupState && (startupState = new StartupState);\n  injectCss(($clinit_MaterialIconMorphClientBundle_default_InlineClientBundleGenerator$morphCssInitializer() , morphCss));\n}\n\nfunction $setIconSize(this$static, size_0){\n  $setCssName(this$static.sizeMixin, size_0);\n}\n\nfunction MaterialIconMorph(){\n  $clinit_MaterialIconMorph();\n  MaterialWidget_1.call(this, $doc.createElement('div'), initValues(getClassLiteralForArray(Ljava_lang_String_2_classLit, 1), $intern_3, 2, 4, ['anim-container']));\n  this.sizeMixin = new CssNameMixin(this);\n  $setAttribute(($clinit_DOM() , this.element), 'onclick', \"this.classList.toggle('morphed')\");\n}\n\ndefineClass(259, 23, $intern_62, MaterialIconMorph);\n_.onLoad = function onLoad_13(){\n  var source, target;\n  $onLoad_0(this);\n  if (this.children_0.size_0 >= 2) {\n    source = dynamicCast($get_3(this.children_0, 0), 33);\n    setStyleName(($clinit_DOM() , source.element), 'icons source', true);\n    target = dynamicCast($get_3(this.children_0, 1), 33);\n    setStyleName(target.element, 'icons target', true);\n  }\n   else {\n    $toast(new MaterialToast_0(initValues(getClassLiteralForArray(Lcom_google_gwt_user_client_ui_Widget_2_classLit, 1), $intern_3, 21, 0, [])), 'Nothing', $intern_66, null);\n  }\n}\n;\nvar Lgwt_material_design_addins_client_iconmorph_MaterialIconMorph_2_classLit = createForClass('gwt.material.design.addins.client.iconmorph', 'MaterialIconMorph', 259);\nvar morphCss;\nfunction MaterialIconMorphClientBundle_default_InlineClientBundleGenerator$1(){\n}\n\ndefineClass(1773, 1, {}, MaterialIconMorphClientBundle_default_InlineClientBundleGenerator$1);\n_.getName = function getName_14(){\n  return 'morphCss';\n}\n;\n_.getText = function getText_5(){\n  return '.anim-container {height: 4rem; width: 4rem; transition: .3s; -webkit-transition: .3s; -moz-transition: .3s; position: relative; cursor: pointer; } .anim-container .icons {transition: .3s; -moz-transition: .3s; -webkit-transition: .3s; position: absolute; font-size: 4em !important; height: 1em; width: 1em; } .anim-container .source {transform: rotate(-135deg); -moz-transform: rotate(-135deg); -webkit-transform: rotate(-135deg); opacity: 0; } .anim-container.morphed {transform: rotate(135deg); -moz-transform: rotate(135deg); -webkit-transform: rotate(135deg); } .anim-container.morphed .source {opacity: 1; visibility: visible; } .anim-container.morphed .target {opacity: 0; visibility: hidden; } .anim-container.tiny {height: 1rem; width: 1rem; font-size: .5rem; } .anim-container.small {height: 2rem; width: 2rem; font-size: .5rem; } .anim-container.medium {height: 4rem; width: 4rem; font-size: .5rem; } .anim-container.large {height: 6rem; width: 6rem; font-size: .5rem; } .anim-container.tiny .icons{font-size: 2em !important; } .anim-container.medium .icons{font-size: 8em !important; } .anim-container.large .icons{font-size: 12em !important; }';\n}\n;\nvar Lgwt_material_design_addins_client_iconmorph_MaterialIconMorphClientBundle_1default_1InlineClientBundleGenerator$1_2_classLit = createForClass('gwt.material.design.addins.client.iconmorph', 'MaterialIconMorphClientBundle_default_InlineClientBundleGenerator/1', 1773);\nfunction $clinit_MaterialIconMorphClientBundle_default_InlineClientBundleGenerator$morphCssInitializer(){\n  $clinit_MaterialIconMorphClientBundle_default_InlineClientBundleGenerator$morphCssInitializer = emptyMethod;\n  morphCss = new MaterialIconMorphClientBundle_default_InlineClientBundleGenerator$1;\n}\n\nfunction IconMorphPresenter(eventBus, view, proxy){\n  $clinit_PresenterWidget();\n  Presenter.call(this, eventBus, view, proxy, ($clinit_ApplicationPresenter() , SLOT_MAIN));\n}\n\ndefineClass(672, 53, $intern_55, IconMorphPresenter);\n_.onReveal = function onReveal_9(){\n  $clinit_SetPageTitleEvent();\n  $fireEvent_1(this, new SetPageTitleEvent('Icon Morph', 'Provides visual continuity by morphing two material icons.'));\n}\n;\nvar Lgwt_material_design_demo_client_application_addins_iconmorph_IconMorphPresenter_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.iconmorph', 'IconMorphPresenter', 672);\nfunction IconMorphView(){\n  ViewImpl.call(this);\n  $initWidget_0(this, $build_f_HTMLPanel1_5(new IconMorphView_BinderImpl$Widgets));\n}\n\ndefineClass(898, 56, $intern_56, IconMorphView);\nvar Lgwt_material_design_demo_client_application_addins_iconmorph_IconMorphView_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.iconmorph', 'IconMorphView', 898);\nfunction IconMorphView_BinderImpl(){\n}\n\ndefineClass(1155, 1, {}, IconMorphView_BinderImpl);\nvar Lgwt_material_design_demo_client_application_addins_iconmorph_IconMorphView_1BinderImpl_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.iconmorph', 'IconMorphView_BinderImpl', 1155);\nfunction $build_f_HTMLPanel1_5(this$static){\n  var __attachRecord__, f_HTMLPanel1, f_MaterialTitle2, f_PrettyPre3, f_iconmorph$MaterialIconMorph4, f_PrettyPre7, f_MaterialTitle8, f_iconmorph$MaterialIconMorph9, f_iconmorph$MaterialIconMorph12, f_iconmorph$MaterialIconMorph15, f_iconmorph$MaterialIconMorph18, f_PrettyPre21, sb, f_MaterialIcon5, f_MaterialIcon6, sb_0, f_MaterialIcon10, f_MaterialIcon11, f_MaterialIcon13, f_MaterialIcon14, f_MaterialIcon16, f_MaterialIcon17, f_MaterialIcon19, f_MaterialIcon20, sb_1;\n  f_HTMLPanel1 = new HTMLPanel($html4_2(this$static.domId0, this$static.domId1, this$static.domId2, this$static.domId3, this$static.domId4, this$static.domId5, this$static.domId6, this$static.domId7, this$static.domId8, this$static.domId9).html_0);\n  __attachRecord__ = attachToDom(($clinit_DOM() , f_HTMLPanel1.element));\n  $get_0(this$static.domId0Element);\n  $get_0(this$static.domId1Element);\n  $get_0(this$static.domId2Element);\n  $get_0(this$static.domId3Element);\n  $get_0(this$static.domId4Element);\n  $get_0(this$static.domId5Element);\n  $get_0(this$static.domId6Element);\n  $get_0(this$static.domId7Element);\n  $get_0(this$static.domId8Element);\n  $get_0(this$static.domId9Element);\n  __attachRecord__.origParent?$insertBefore(__attachRecord__.origParent, __attachRecord__.element, __attachRecord__.origSibling):orphan(__attachRecord__.element);\n  $addAndReplaceElement_1(f_HTMLPanel1, (f_MaterialTitle2 = new MaterialTitle , $setInnerHTML($getElement(f_MaterialTitle2.header), 'Usage') , f_MaterialTitle2), $get_0(this$static.domId0Element));\n  $addAndReplaceElement_1(f_HTMLPanel1, (f_PrettyPre3 = new PrettyPre , $setHTML_0(f_PrettyPre3, (sb = new StringBuilder , sb.string += '\\u2003&lt;!-- Addin Import --&gt;<br> xmlns:ma=\"urn:import:gwt.material.design.addins.client\"<br><br> &lt;!-- Addin Usage --&gt;<br> &lt;ma:iconmorph.MaterialIconMorph iconSize=\"MEDIUM\"&gt;<br> \\u2003&lt;m:MaterialIcon iconType=\"MENU\" addStyleNames=\"source\"/&gt;<br> \\u2003&lt;m:MaterialIcon iconType=\"ARROW_BACK\" addStyleNames=\"target\"/&gt;<br> &lt;/ma:iconmorph.MaterialIconMorph&gt;' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.string)).html_0) , setStyleName(f_PrettyPre3.element, 'lang-xml', true) , setStyleName(f_PrettyPre3.element, 'z-depth-1', true) , f_PrettyPre3), $get_0(this$static.domId1Element));\n  $addAndReplaceElement_1(f_HTMLPanel1, (f_iconmorph$MaterialIconMorph4 = new MaterialIconMorph , $add_12(f_iconmorph$MaterialIconMorph4, (f_MaterialIcon5 = new MaterialIcon , setStyleName(f_MaterialIcon5.element, 'source', true) , $setIconType_3(f_MaterialIcon5, ($clinit_IconType() , MENU_0)) , f_MaterialIcon5)) , $add_12(f_iconmorph$MaterialIconMorph4, (f_MaterialIcon6 = new MaterialIcon , setStyleName(f_MaterialIcon6.element, 'target', true) , $setIconType_3(f_MaterialIcon6, ARROW_BACK) , f_MaterialIcon6)) , $setIconSize(f_iconmorph$MaterialIconMorph4, ($clinit_IconSize() , MEDIUM_0)) , f_iconmorph$MaterialIconMorph4), $get_0(this$static.domId2Element));\n  $addAndReplaceElement_1(f_HTMLPanel1, (f_PrettyPre7 = new PrettyPre , $setHTML_0(f_PrettyPre7, (sb_0 = new StringBuilder , sb_0.string += '\\u2003&lt;ma:iconmorph.MaterialIconMorph iconSize=\"MEDIUM\"&gt;<br> \\u2003&lt;m:MaterialIcon iconType=\"MENU\" addStyleNames=\"source\"/&gt;<br> \\u2003&lt;m:MaterialIcon iconType=\"ARROW_BACK\" addStyleNames=\"target\"/&gt;<br> &lt;/ma:iconmorph.MaterialIconMorph&gt;' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_0.string)).html_0) , setStyleName(f_PrettyPre7.element, 'lang-xml', true) , setStyleName(f_PrettyPre7.element, 'z-depth-1', true) , f_PrettyPre7), $get_0(this$static.domId3Element));\n  $addAndReplaceElement_1(f_HTMLPanel1, (f_MaterialTitle8 = new MaterialTitle , $setInnerHTML($getElement(f_MaterialTitle8.header), 'Sizes') , $setText_9(f_MaterialTitle8.paragraph, \"Like Material Icons you can easily adjust the sizes of icons by adding iconSize='SIZE' into your MaterialIconMorph component\") , f_MaterialTitle8), $get_0(this$static.domId4Element));\n  $addAndReplaceElement_1(f_HTMLPanel1, (f_iconmorph$MaterialIconMorph9 = new MaterialIconMorph , $add_12(f_iconmorph$MaterialIconMorph9, (f_MaterialIcon10 = new MaterialIcon , setStyleName(f_MaterialIcon10.element, 'source', true) , $setIconType_3(f_MaterialIcon10, POLYMER) , f_MaterialIcon10)) , $add_12(f_iconmorph$MaterialIconMorph9, (f_MaterialIcon11 = new MaterialIcon , setStyleName(f_MaterialIcon11.element, 'target', true) , $setIconType_3(f_MaterialIcon11, DONE) , f_MaterialIcon11)) , $setIconSize(f_iconmorph$MaterialIconMorph9, TINY) , f_iconmorph$MaterialIconMorph9), $get_0(this$static.domId5Element));\n  $addAndReplaceElement_1(f_HTMLPanel1, (f_iconmorph$MaterialIconMorph12 = new MaterialIconMorph , $add_12(f_iconmorph$MaterialIconMorph12, (f_MaterialIcon13 = new MaterialIcon , setStyleName(f_MaterialIcon13.element, 'source', true) , $setIconType_3(f_MaterialIcon13, POLYMER) , f_MaterialIcon13)) , $add_12(f_iconmorph$MaterialIconMorph12, (f_MaterialIcon14 = new MaterialIcon , setStyleName(f_MaterialIcon14.element, 'target', true) , $setIconType_3(f_MaterialIcon14, DONE) , f_MaterialIcon14)) , $setIconSize(f_iconmorph$MaterialIconMorph12, SMALL) , f_iconmorph$MaterialIconMorph12), $get_0(this$static.domId6Element));\n  $addAndReplaceElement_1(f_HTMLPanel1, (f_iconmorph$MaterialIconMorph15 = new MaterialIconMorph , $add_12(f_iconmorph$MaterialIconMorph15, (f_MaterialIcon16 = new MaterialIcon , setStyleName(f_MaterialIcon16.element, 'source', true) , $setIconType_3(f_MaterialIcon16, POLYMER) , f_MaterialIcon16)) , $add_12(f_iconmorph$MaterialIconMorph15, (f_MaterialIcon17 = new MaterialIcon , setStyleName(f_MaterialIcon17.element, 'target', true) , $setIconType_3(f_MaterialIcon17, DONE) , f_MaterialIcon17)) , $setIconSize(f_iconmorph$MaterialIconMorph15, MEDIUM_0) , f_iconmorph$MaterialIconMorph15), $get_0(this$static.domId7Element));\n  $addAndReplaceElement_1(f_HTMLPanel1, (f_iconmorph$MaterialIconMorph18 = new MaterialIconMorph , $add_12(f_iconmorph$MaterialIconMorph18, (f_MaterialIcon19 = new MaterialIcon , setStyleName(f_MaterialIcon19.element, 'source', true) , $setIconType_3(f_MaterialIcon19, POLYMER) , f_MaterialIcon19)) , $add_12(f_iconmorph$MaterialIconMorph18, (f_MaterialIcon20 = new MaterialIcon , setStyleName(f_MaterialIcon20.element, 'target', true) , $setIconType_3(f_MaterialIcon20, DONE) , f_MaterialIcon20)) , $setIconSize(f_iconmorph$MaterialIconMorph18, LARGE_0) , f_iconmorph$MaterialIconMorph18), $get_0(this$static.domId8Element));\n  $addAndReplaceElement_1(f_HTMLPanel1, (f_PrettyPre21 = new PrettyPre , $setHTML_0(f_PrettyPre21, (sb_1 = new StringBuilder , sb_1.string += '\\u2003&lt;ma:iconmorph.MaterialIconMorph iconSize=\"TINY\"&gt;<br> \\u2003&lt;m:MaterialIcon iconType=\"POLYMER\" addStyleNames=\"source\"/&gt;<br> \\u2003&lt;m:MaterialIcon iconType=\"DONE\" addStyleNames=\"target\"/&gt;<br> &lt;/ma:iconmorph.MaterialIconMorph&gt;<br>' , new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb_1.string)).html_0) , setStyleName(f_PrettyPre21.element, 'lang-xml', true) , setStyleName(f_PrettyPre21.element, 'z-depth-1', true) , f_PrettyPre21), $get_0(this$static.domId9Element));\n  return f_HTMLPanel1;\n}\n\nfunction IconMorphView_BinderImpl$Widgets(){\n  this.domId0 = $createUniqueId($doc);\n  this.domId1 = $createUniqueId($doc);\n  this.domId2 = $createUniqueId($doc);\n  this.domId3 = $createUniqueId($doc);\n  this.domId4 = $createUniqueId($doc);\n  this.domId5 = $createUniqueId($doc);\n  this.domId6 = $createUniqueId($doc);\n  this.domId7 = $createUniqueId($doc);\n  this.domId8 = $createUniqueId($doc);\n  this.domId9 = $createUniqueId($doc);\n  this.domId0Element = new LazyDomElement(this.domId0);\n  this.domId1Element = new LazyDomElement(this.domId1);\n  this.domId2Element = new LazyDomElement(this.domId2);\n  this.domId3Element = new LazyDomElement(this.domId3);\n  this.domId4Element = new LazyDomElement(this.domId4);\n  this.domId5Element = new LazyDomElement(this.domId5);\n  this.domId6Element = new LazyDomElement(this.domId6);\n  this.domId7Element = new LazyDomElement(this.domId7);\n  this.domId8Element = new LazyDomElement(this.domId8);\n  this.domId9Element = new LazyDomElement(this.domId9);\n}\n\ndefineClass(1156, 1, {}, IconMorphView_BinderImpl$Widgets);\nvar Lgwt_material_design_demo_client_application_addins_iconmorph_IconMorphView_1BinderImpl$Widgets_2_classLit = createForClass('gwt.material.design.demo.client.application.addins.iconmorph', 'IconMorphView_BinderImpl/Widgets', 1156);\nfunction $html4_2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9){\n  var sb;\n  sb = new StringBuilder;\n  sb.string += \"<span id='\";\n  $append_3(sb, htmlEscape(arg0));\n  sb.string += \"'><\\/span> <span id='\";\n  $append_3(sb, htmlEscape(arg1));\n  sb.string += \"'><\\/span>  <span id='\";\n  $append_3(sb, htmlEscape(arg2));\n  sb.string += \"'><\\/span>  <span id='\";\n  $append_3(sb, htmlEscape(arg3));\n  sb.string += \"'><\\/span> <span id='\";\n  $append_3(sb, htmlEscape(arg4));\n  sb.string += \"'><\\/span>   <span id='\";\n  $append_3(sb, htmlEscape(arg5));\n  sb.string += \"'><\\/span>  <span id='\";\n  $append_3(sb, htmlEscape(arg6));\n  sb.string += \"'><\\/span>  <span id='\";\n  $append_3(sb, htmlEscape(arg7));\n  sb.string += \"'><\\/span>  <span id='\";\n  $append_3(sb, htmlEscape(arg8));\n  sb.string += \"'><\\/span>  <span id='\";\n  $append_3(sb, htmlEscape(arg9));\n  sb.string += \"'><\\/span>\";\n  return new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.string);\n}\n\nfunction $get_Key$type$gwt$material$design$demo$client$application$addins$iconmorph$IconMorphPresenter$_annotation$$none$$(this$static){\n  var result;\n  if (!this$static.singleton_Key$type$gwt$material$design$demo$client$application$addins$iconmorph$IconMorphPresenter$_annotation$$none$$) {\n    result = new IconMorphPresenter($get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$($getFragment_com_google_web_bindery_event_shared(this$static.injector)), $get_Key$type$gwt$material$design$demo$client$application$addins$iconmorph$IconMorphView$_annotation$$none$$(this$static), $get_Key$type$gwt$material$design$demo$client$application$addins$iconmorph$IconMorphPresenter$MyProxy$_annotation$$none$$(this$static));\n    $automaticBind(($getFragment_com_gwtplatform_mvp_client(this$static.injector) , result), $get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$($getFragment_com_gwtplatform_mvp_client(this$static.injector)));\n    this$static.singleton_Key$type$gwt$material$design$demo$client$application$addins$iconmorph$IconMorphPresenter$_annotation$$none$$ = result;\n  }\n  return this$static.singleton_Key$type$gwt$material$design$demo$client$application$addins$iconmorph$IconMorphPresenter$_annotation$$none$$;\n}\n\nfunction $get_Key$type$gwt$material$design$demo$client$application$addins$iconmorph$IconMorphView$_annotation$$none$$(this$static){\n  var result;\n  if (!this$static.singleton_Key$type$gwt$material$design$demo$client$application$addins$iconmorph$IconMorphView$_annotation$$none$$) {\n    result = new IconMorphView(new IconMorphView_BinderImpl);\n    this$static.singleton_Key$type$gwt$material$design$demo$client$application$addins$iconmorph$IconMorphView$_annotation$$none$$ = result;\n  }\n  return this$static.singleton_Key$type$gwt$material$design$demo$client$application$addins$iconmorph$IconMorphView$_annotation$$none$$;\n}\n\ndefineClass(570, 1, $intern_95);\n_.onSuccess_0 = function onSuccess_5(){\n  $onSuccess_0(this.val$callback2, $get_Key$type$gwt$material$design$demo$client$application$addins$iconmorph$IconMorphPresenter$_annotation$$none$$(this.this$11.this$01));\n}\n;\n$entry(onLoad_0)(4);\n\n//# sourceURL=gwtmaterialdemo-4.js\n")

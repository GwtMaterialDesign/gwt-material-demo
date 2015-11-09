$wnd.gwtmaterialdemo.runAsyncCallback7("function DropdownPresenter(eventBus, view, proxy){\n  $clinit_PresenterWidget();\n  Presenter.call(this, eventBus, view, proxy, ($clinit_ApplicationPresenter() , SLOT_MainContent));\n}\n\ndefineClass(512, 51, $intern_39, DropdownPresenter);\n_.onReveal = function onReveal_12(){\n  $clinit_SetPageTitleEvent();\n  $fireEvent_1(this, new SetPageTitleEvent('Dropdown', \"You can add dropdown easily by specifying it's item content and add a UiHandler on it to implement any event.\"));\n}\n;\nvar Lgwt_material_design_demo_client_application_components_dropdown_DropdownPresenter_2_classLit = createForClass('gwt.material.design.demo.client.application.components.dropdown', 'DropdownPresenter', 512);\nfunction DropdownView(){\n  ViewImpl.call(this);\n  $initWidget_0(this, $build_f_MaterialPanel1_0(new DropdownView_BinderImpl$Widgets));\n}\n\ndefineClass(646, 55, $intern_40, DropdownView);\nvar Lgwt_material_design_demo_client_application_components_dropdown_DropdownView_2_classLit = createForClass('gwt.material.design.demo.client.application.components.dropdown', 'DropdownView', 646);\nfunction DropdownView_BinderImpl(){\n}\n\ndefineClass(810, 1, {}, DropdownView_BinderImpl);\nvar Lgwt_material_design_demo_client_application_components_dropdown_DropdownView_1BinderImpl_2_classLit = createForClass('gwt.material.design.demo.client.application.components.dropdown', 'DropdownView_BinderImpl', 810);\nfunction $build_f_HTMLPanel2(this$static){\n  var __attachRecord__, f_HTMLPanel2, f_MaterialTitle3, f_MaterialTitle4, f_MaterialButton5, f_MaterialDropDown6, f_MaterialTitle10, f_MaterialButton11, f_MaterialDropDown12, f_MaterialTitle16, f_MaterialIcon17, f_MaterialDropDown18, f_MaterialLink7, f_MaterialLink8, f_MaterialLink9, f_MaterialLink13, f_MaterialLink14, f_MaterialLink15, linkDialPad, linkVoicemail, linkNotification;\n  f_HTMLPanel2 = new HTMLPanel($html1_8(this$static.domId0, this$static.domId1, this$static.domId2, this$static.domId3, this$static.domId4, this$static.domId5, this$static.domId6, this$static.domId7, this$static.domId8, this$static.domId9).html);\n  __attachRecord__ = attachToDom(($clinit_DOM() , f_HTMLPanel2.element));\n  $get_0(this$static.domId0Element);\n  $get_0(this$static.domId1Element);\n  $get_0(this$static.domId2Element);\n  $get_0(this$static.domId3Element);\n  $get_0(this$static.domId4Element);\n  $get_0(this$static.domId5Element);\n  $get_0(this$static.domId6Element);\n  $get_0(this$static.domId7Element);\n  $get_0(this$static.domId8Element);\n  $get_0(this$static.domId9Element);\n  __attachRecord__.origParent?$insertBefore(__attachRecord__.origParent, __attachRecord__.element, __attachRecord__.origSibling):orphan(__attachRecord__.element);\n  $addAndReplaceElement_1(f_HTMLPanel2, (f_MaterialTitle3 = new MaterialTitle , $setInnerHTML($getElement(f_MaterialTitle3.header), 'Dropdown Properties') , f_MaterialTitle3), $get_0(this$static.domId0Element));\n  $addAndReplaceElement_1(f_HTMLPanel2, (f_MaterialTitle4 = new MaterialTitle , $setInnerHTML($getElement(f_MaterialTitle4.header), 'Introduction') , $setText_4(f_MaterialTitle4.paragraph, 'Add a dropdown list to any button. Make sure to add the property activates to be able to initialize the dropdown plugin, it will use that as your id on your dropdown menu.') , f_MaterialTitle4), $get_0(this$static.domId1Element));\n  $addAndReplaceElement_1(f_HTMLPanel2, (f_MaterialButton5 = new MaterialButton , $setIconPosition(f_MaterialButton5, ($clinit_IconPosition() , RIGHT_5)) , f_MaterialButton5.span_0.setText('Dropdown') , $add_13(f_MaterialButton5, f_MaterialButton5.span_0) , $setTextColor(f_MaterialButton5.colorsMixin, 'white') , $setActivates(f_MaterialButton5, 'dp-2') , $setBackgroundColor(f_MaterialButton5.colorsMixin, 'blue') , $setIconType(f_MaterialButton5, ($clinit_IconType() , ARROW_DROP_DOWN)) , f_MaterialButton5), $get_0(this$static.domId2Element));\n  $addAndReplaceElement_1(f_HTMLPanel2, (f_MaterialDropDown6 = new MaterialDropDown('dp-2') , $add_20(f_MaterialDropDown6, (f_MaterialLink7 = new MaterialLink , f_MaterialLink7.span_0.setText('First') , $add_13(f_MaterialLink7, f_MaterialLink7.span_0) , f_MaterialLink7)) , $add_20(f_MaterialDropDown6, (f_MaterialLink8 = new MaterialLink , f_MaterialLink8.span_0.setText('Second') , $add_13(f_MaterialLink8, f_MaterialLink8.span_0) , f_MaterialLink8)) , $add_20(f_MaterialDropDown6, (f_MaterialLink9 = new MaterialLink , f_MaterialLink9.span_0.setText('Third') , $add_13(f_MaterialLink9, f_MaterialLink9.span_0) , f_MaterialLink9)) , f_MaterialDropDown6.constrainWidth = true , f_MaterialDropDown6), $get_0(this$static.domId3Element));\n  $addAndReplaceElement_1(f_HTMLPanel2, (f_MaterialTitle10 = new MaterialTitle , $setInnerHTML($getElement(f_MaterialTitle10.header), 'Designing') , $setText_4(f_MaterialTitle10.paragraph, 'You can add divider, waves and color attributes to your dropdown. On items you can use any Material Widgets like MaterialLink, MaterialButton etc. to add it inside the dropdown.') , f_MaterialTitle10), $get_0(this$static.domId4Element));\n  $addAndReplaceElement_1(f_HTMLPanel2, (f_MaterialButton11 = new MaterialButton , $setIconPosition(f_MaterialButton11, RIGHT_5) , f_MaterialButton11.span_0.setText('Dropdown') , $add_13(f_MaterialButton11, f_MaterialButton11.span_0) , $setTextColor(f_MaterialButton11.colorsMixin, 'white') , $setActivates(f_MaterialButton11, 'dp-3') , $setBackgroundColor(f_MaterialButton11.colorsMixin, 'blue') , $setIconType(f_MaterialButton11, ARROW_DROP_DOWN) , f_MaterialButton11), $get_0(this$static.domId5Element));\n  $addAndReplaceElement_1(f_HTMLPanel2, (f_MaterialDropDown12 = new MaterialDropDown('dp-3') , $add_20(f_MaterialDropDown12, (f_MaterialLink13 = new MaterialLink , $setIconPosition(f_MaterialLink13, RIGHT_5) , f_MaterialLink13.span_0.setText('First') , $add_13(f_MaterialLink13, f_MaterialLink13.span_0) , $getElement(f_MaterialLink13.separatorMixin.uiObject).style['borderBottom'] = '1px solid #e9e9e9' , $setIconType(f_MaterialLink13, POLYMER) , f_MaterialLink13)) , $add_20(f_MaterialDropDown12, (f_MaterialLink14 = new MaterialLink , $setIconPosition(f_MaterialLink14, RIGHT_5) , f_MaterialLink14.span_0.setText('Second') , $add_13(f_MaterialLink14, f_MaterialLink14.span_0) , $getElement(f_MaterialLink14.separatorMixin.uiObject).style['borderBottom'] = '1px solid #e9e9e9' , $setIconType(f_MaterialLink14, POLYMER) , f_MaterialLink14)) , $add_20(f_MaterialDropDown12, (f_MaterialLink15 = new MaterialLink , $setIconPosition(f_MaterialLink15, RIGHT_5) , f_MaterialLink15.span_0.setText('Third') , $add_13(f_MaterialLink15, f_MaterialLink15.span_0) , $getElement(f_MaterialLink15.separatorMixin.uiObject).style['borderBottom'] = '1px solid #e9e9e9' , $setIconType(f_MaterialLink15, POLYMER) , f_MaterialLink15)) , f_MaterialDropDown12.constrainWidth = true , f_MaterialDropDown12), $get_0(this$static.domId6Element));\n  $addAndReplaceElement_1(f_HTMLPanel2, (f_MaterialTitle16 = new MaterialTitle , $setInnerHTML($getElement(f_MaterialTitle16.header), 'Icon Dropdown') , f_MaterialTitle16), $get_0(this$static.domId7Element));\n  $addAndReplaceElement_1(f_HTMLPanel2, (f_MaterialIcon17 = new MaterialIcon , $setActivates(f_MaterialIcon17, 'dp-4') , $setWaves(f_MaterialIcon17, ($clinit_WavesType() , DEFAULT_5)) , $setGrid(f_MaterialIcon17.gridMixin, 'l2') , f_MaterialIcon17.element.style['color'] = 'black' , undefined , $setIconType_2(f_MaterialIcon17, PHONE) , f_MaterialIcon17), $get_0(this$static.domId8Element));\n  $addAndReplaceElement_1(f_HTMLPanel2, (f_MaterialDropDown18 = new MaterialDropDown('dp-4') , $add_20(f_MaterialDropDown18, (linkDialPad = new MaterialLink , $setIconPosition(linkDialPad, LEFT_4) , linkDialPad.span_0.setText('Redial') , $add_13(linkDialPad, linkDialPad.span_0) , $setTextColor(linkDialPad.colorsMixin, 'black') , $setWaves(linkDialPad, DEFAULT_5) , $setFontSize_0(linkDialPad.fontSizeMixin, '0.9em') , $setIconType(linkDialPad, DIALPAD) , linkDialPad)) , $add_20(f_MaterialDropDown18, (linkVoicemail = new MaterialLink , $setEnabled_1(linkVoicemail.enabledMixin) , $setIconPosition(linkVoicemail, LEFT_4) , linkVoicemail.span_0.setText('Check voicemail') , $add_13(linkVoicemail, linkVoicemail.span_0) , $setTextColor(linkVoicemail.colorsMixin, 'black') , $setWaves(linkVoicemail, DEFAULT_5) , $setFontSize_0(linkVoicemail.fontSizeMixin, '0.9em') , $getElement(linkVoicemail.separatorMixin.uiObject).style['borderBottom'] = '1px solid #e9e9e9' , $setIconType(linkVoicemail, VOICEMAIL) , linkVoicemail)) , $add_20(f_MaterialDropDown18, (linkNotification = new MaterialLink , $setIconPosition(linkNotification, LEFT_4) , linkNotification.span_0.setText('Disable Notification') , $add_13(linkNotification, linkNotification.span_0) , $setTextColor(linkNotification.colorsMixin, 'black') , $setWaves(linkNotification, DEFAULT_5) , $setFontSize_0(linkNotification.fontSizeMixin, '0.9em') , $setIconType(linkNotification, NOTIFICATIONS_OFF) , linkNotification)) , f_MaterialDropDown18.constrainWidth = false , f_MaterialDropDown18), $get_0(this$static.domId9Element));\n  return f_HTMLPanel2;\n}\n\nfunction $build_f_MaterialPanel1_0(this$static){\n  var f_MaterialPanel1;\n  f_MaterialPanel1 = new MaterialPanel;\n  $add_13(f_MaterialPanel1, $build_f_HTMLPanel2(this$static));\n  return f_MaterialPanel1;\n}\n\nfunction DropdownView_BinderImpl$Widgets(){\n  this.domId0 = $createUniqueId($doc);\n  this.domId1 = $createUniqueId($doc);\n  this.domId2 = $createUniqueId($doc);\n  this.domId3 = $createUniqueId($doc);\n  this.domId4 = $createUniqueId($doc);\n  this.domId5 = $createUniqueId($doc);\n  this.domId6 = $createUniqueId($doc);\n  this.domId7 = $createUniqueId($doc);\n  this.domId8 = $createUniqueId($doc);\n  this.domId9 = $createUniqueId($doc);\n  this.domId0Element = new LazyDomElement(this.domId0);\n  this.domId1Element = new LazyDomElement(this.domId1);\n  this.domId2Element = new LazyDomElement(this.domId2);\n  this.domId3Element = new LazyDomElement(this.domId3);\n  this.domId4Element = new LazyDomElement(this.domId4);\n  this.domId5Element = new LazyDomElement(this.domId5);\n  this.domId6Element = new LazyDomElement(this.domId6);\n  this.domId7Element = new LazyDomElement(this.domId7);\n  this.domId8Element = new LazyDomElement(this.domId8);\n  this.domId9Element = new LazyDomElement(this.domId9);\n}\n\ndefineClass(811, 1, {}, DropdownView_BinderImpl$Widgets);\nvar Lgwt_material_design_demo_client_application_components_dropdown_DropdownView_1BinderImpl$Widgets_2_classLit = createForClass('gwt.material.design.demo.client.application.components.dropdown', 'DropdownView_BinderImpl/Widgets', 811);\nfunction $html1_8(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9){\n  var sb;\n  sb = new StringBuilder;\n  sb.string += \"<span id='\";\n  $append_3(sb, htmlEscape(arg0));\n  sb.string += \"'><\\/span> <blockquote> <p>name - name of your dropdown, a unique name needs for the activator to set it e.g activates='dropdown_name'<\\/p> <p>constraintWidth - Does not change width of dropdown to that of the activator<\\/p> <p>belowOrigin - displays dropdown below the button<\\/p> <\\/blockquote> <span id='\";\n  $append_3(sb, htmlEscape(arg1));\n  sb.string += \"'><\\/span>  <span id='\";\n  $append_3(sb, htmlEscape(arg2));\n  sb.string += \"'><\\/span>  <span id='\";\n  $append_3(sb, htmlEscape(arg3));\n  sb.string += \"'><\\/span> <pre>\\n        Code\\n      <\\/pre> <span id='\";\n  $append_3(sb, htmlEscape(arg4));\n  sb.string += \"'><\\/span>  <span id='\";\n  $append_3(sb, htmlEscape(arg5));\n  sb.string += \"'><\\/span>  <span id='\";\n  $append_3(sb, htmlEscape(arg6));\n  sb.string += \"'><\\/span> <pre>\\n        Code\\n      <\\/pre> <span id='\";\n  $append_3(sb, htmlEscape(arg7));\n  sb.string += \"'><\\/span> <span id='\";\n  $append_3(sb, htmlEscape(arg8));\n  sb.string += \"'><\\/span> <span id='\";\n  $append_3(sb, htmlEscape(arg9));\n  sb.string += \"'><\\/span>\";\n  return new OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.string);\n}\n\nfunction $get_Key$type$gwt$material$design$demo$client$application$components$dropdown$DropdownPresenter$_annotation$$none$$(this$static){\n  var result;\n  if (!this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$dropdown$DropdownPresenter$_annotation$$none$$) {\n    result = new DropdownPresenter($get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$($getFragment_com_google_web_bindery_event_shared(this$static.injector)), $get_Key$type$gwt$material$design$demo$client$application$components$dropdown$DropdownView$_annotation$$none$$(this$static), $get_Key$type$gwt$material$design$demo$client$application$components$dropdown$DropdownPresenter$MyProxy$_annotation$$none$$(this$static));\n    $automaticBind(($getFragment_com_gwtplatform_mvp_client(this$static.injector) , result), $get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$($getFragment_com_gwtplatform_mvp_client(this$static.injector)));\n    this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$dropdown$DropdownPresenter$_annotation$$none$$ = result;\n  }\n  return this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$dropdown$DropdownPresenter$_annotation$$none$$;\n}\n\nfunction $get_Key$type$gwt$material$design$demo$client$application$components$dropdown$DropdownView$_annotation$$none$$(this$static){\n  var result;\n  if (!this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$dropdown$DropdownView$_annotation$$none$$) {\n    result = new DropdownView(new DropdownView_BinderImpl);\n    this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$dropdown$DropdownView$_annotation$$none$$ = result;\n  }\n  return this$static.singleton_Key$type$gwt$material$design$demo$client$application$components$dropdown$DropdownView$_annotation$$none$$;\n}\n\ndefineClass(454, 1, $intern_53);\n_.onSuccess_0 = function onSuccess_6(){\n  $onSuccess_0(this.val$callback2, $get_Key$type$gwt$material$design$demo$client$application$components$dropdown$DropdownPresenter$_annotation$$none$$(this.this$11.this$01));\n}\n;\n$entry(onLoad_0)(7);\n\n//# sourceURL=gwtmaterialdemo-7.js\n")
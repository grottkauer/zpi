#pragma checksum "D:\Users\oladr\Studia\Term_VI\ZPI\zpi\borrow-me\borrow-me\Views\Home\Index.cshtml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "4678783c7d9c9a373644cbf2e96660505c110519"
// <auto-generated/>
#pragma warning disable 1591
[assembly: global::Microsoft.AspNetCore.Razor.Hosting.RazorCompiledItemAttribute(typeof(AspNetCore.Views_Home_Index), @"mvc.1.0.view", @"/Views/Home/Index.cshtml")]
[assembly:global::Microsoft.AspNetCore.Mvc.Razor.Compilation.RazorViewAttribute(@"/Views/Home/Index.cshtml", typeof(AspNetCore.Views_Home_Index))]
namespace AspNetCore
{
    #line hidden
    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Threading.Tasks;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.AspNetCore.Mvc.Rendering;
    using Microsoft.AspNetCore.Mvc.ViewFeatures;
#line 1 "D:\Users\oladr\Studia\Term_VI\ZPI\zpi\borrow-me\borrow-me\Views\_ViewImports.cshtml"
using borrow_me;

#line default
#line hidden
#line 2 "D:\Users\oladr\Studia\Term_VI\ZPI\zpi\borrow-me\borrow-me\Views\_ViewImports.cshtml"
using borrow_me.Models;

#line default
#line hidden
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"4678783c7d9c9a373644cbf2e96660505c110519", @"/Views/Home/Index.cshtml")]
    [global::Microsoft.AspNetCore.Razor.Hosting.RazorSourceChecksumAttribute(@"SHA1", @"ac9177f1c2bc3ffb92dd35dd1575e7e2c9e56573", @"/Views/_ViewImports.cshtml")]
    public class Views_Home_Index : global::Microsoft.AspNetCore.Mvc.Razor.RazorPage<dynamic>
    {
        #line hidden
        #pragma warning disable 0169
        private string __tagHelperStringValueBuffer;
        #pragma warning restore 0169
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperExecutionContext __tagHelperExecutionContext;
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperRunner __tagHelperRunner = new global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperRunner();
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager __backed__tagHelperScopeManager = null;
        private global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager __tagHelperScopeManager
        {
            get
            {
                if (__backed__tagHelperScopeManager == null)
                {
                    __backed__tagHelperScopeManager = new global::Microsoft.AspNetCore.Razor.Runtime.TagHelpers.TagHelperScopeManager(StartTagHelperWritingScope, EndTagHelperWritingScope);
                }
                return __backed__tagHelperScopeManager;
            }
        }
        private global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.HeadTagHelper __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_HeadTagHelper;
        private global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.BodyTagHelper __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_BodyTagHelper;
        #pragma warning disable 1998
        public async override global::System.Threading.Tasks.Task ExecuteAsync()
        {
#line 1 "D:\Users\oladr\Studia\Term_VI\ZPI\zpi\borrow-me\borrow-me\Views\Home\Index.cshtml"
  
    ViewData["Title"] = "Home Page";

#line default
#line hidden
            BeginContext(45, 27, true);
            WriteLiteral("\r\n<!DOCTYPE html>\r\n<html>\r\n");
            EndContext();
            BeginContext(72, 1306, false);
            __tagHelperExecutionContext = __tagHelperScopeManager.Begin("head", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "c080053b39c84946adcf8a85bd0dab6a", async() => {
                BeginContext(78, 1293, true);
                WriteLiteral(@"
    <title>Borrow Me!</title>
    <meta charset=""utf-8"" />
    <link rel=""stylesheet"" href=""../../wwwroot/css/master.css"">
    <link rel=""stylesheet"" href=""https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"">
    <link rel=""stylesheet"" href=""https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"">
    <script src=""https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js""></script>
    <script src=""https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js""></script>
    <script src=""https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js""></script>

    <script type=""text/javascript"">
$(document).ready(function() {
  /* Every time the window is scrolled ... */
  $(window).scroll( function(){
      /* Check the location of each desired element */
      $('.hideme').each( function(i){
          var bottom_of_object = $(this).position().top + $(this).outerHeight();
          var bottom_of_window = $(window).scroll");
                WriteLiteral(@"Top() + $(window).height();
          /* If the object is completely visible in the window, fade it it */
          if( bottom_of_window > bottom_of_object ){
              $(this).animate({'opacity':'1'},1100);
          }
      });
  });
});
    </script>

");
                EndContext();
            }
            );
            __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_HeadTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.HeadTagHelper>();
            __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_Razor_TagHelpers_HeadTagHelper);
            await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
            if (!__tagHelperExecutionContext.Output.IsContentModified)
            {
                await __tagHelperExecutionContext.SetOutputContentAsync();
            }
            Write(__tagHelperExecutionContext.Output);
            __tagHelperExecutionContext = __tagHelperScopeManager.End();
            EndContext();
            BeginContext(1378, 2, true);
            WriteLiteral("\r\n");
            EndContext();
            BeginContext(1380, 12509, false);
            __tagHelperExecutionContext = __tagHelperScopeManager.Begin("body", global::Microsoft.AspNetCore.Razor.TagHelpers.TagMode.StartTagAndEndTag, "e3d33c1f80ba483fa1fe512eb1ebca15", async() => {
                BeginContext(1386, 12496, true);
                WriteLiteral(@"


    <!-- SLIDER Z TEKSTEM -->
    <div id=""przykladowaKaruzela4"" class=""carousel slide pb-5"" data-ride=""carousel"">
        <ol class=""carousel-indicators"">
            <li data-target=""#przykladowaKaruzela4"" data-slide-to=""0"" class=""active""></li>
            <li data-target=""#przykladowaKaruzela4"" data-slide-to=""1""></li>
            <li data-target=""#przykladowaKaruzela4"" data-slide-to=""2""></li>
        </ol>
        <div class=""carousel-inner"">
            <div class=""carousel-item active"">
                <img class=""d-block w-100"" src=""https://placeholdit.imgix.net/~text?txtsize=107&txt=Pierwszy+slide&w=1280&h=500"" alt=""Pierwszy slajd"">
                <div class=""carousel-caption"">
                    <h5>Pierwszy slajd</h5>
                    <p>Opis pierwszego slajdu</p>
                </div>
            </div>
            <div class=""carousel-item"">
                <img class=""d-block w-100"" src=""https://placeholdit.imgix.net/~text?txtsize=107&txt=Drugi+slide&w=1280&h=500"" alt=""");
                WriteLiteral(@"Drugi slajd"">
                <div class=""carousel-caption"">
                    <h5>Drugi slajd</h5>
                    <p>Opis drugiego slajdu</p>
                </div>
            </div>
            <div class=""carousel-item"">
                <img class=""d-block w-100"" src=""https://placeholdit.imgix.net/~text?txtsize=107&txt=Trzeci+slide&w=1280&h=500"" alt=""Trzeci slajd"">
                <div class=""carousel-caption"">
                    <h5>Trzeci slajd</h5>
                    <p>Opis trzeciego slajdu</p>
                </div>
            </div>
        </div>
        <a class=""carousel-control-prev"" href=""#przykladowaKaruzela4"" role=""button"" data-slide=""prev"">
            <span class=""carousel-control-prev-icon"" aria-hidden=""true""></span>
            <span class=""sr-only"">Poprzedni</span>
        </a>
        <a class=""carousel-control-next"" href=""#przykladowaKaruzela4"" role=""button"" data-slide=""next"">
            <span class=""carousel-control-next-icon"" aria-hidden=""true""></span>
");
                WriteLiteral(@"            <span class=""sr-only"">Następny</span>
        </a>
    </div><br><br>

    <!-- PROMOCJA STRONY -->

    <div class=""container"">

        <div class=""row display-flex hideme"">
            <div class=""col-md-6 text-center"">
                <div class=""col-md-12 jumbotron"">
                    <ul class=""list-unstyled mb-0"">
                        <li>
                            <i class=""fa fa-book fa-5x mb-5""></i>
                            <h4 class=""h3-responsive font-weight-bold"">Umożliwiamy wypożyczanie różnych produktów od książek po instrumenty muzyczne</h4>
                        </li>
                    </ul>
                </div>
            </div>
            <div class=""col-md-6 text-center"">

                <div class=""col-md-12 jumbotron"">
                    <ul class=""list-unstyled mb-0"">
                        <li>
                            <i class=""fa fa-users fa-5x mb-5""></i>
                            <h4 class=""h3-responsive font-weight-bold");
                WriteLiteral(@""">Każdy może wystawić swój towar do wypożyczenia i każdy może go wypożyczyć</h4>
                        </li>
                    </ul>
                </div>
            </div>
        </div><br>

        <div class=""row display-flex hideme"">
            <div class=""col-md-6 text-center"">
                <div class=""col-md-12 jumbotron"">
                    <ul class=""list-unstyled mb-0"">
                        <li>
                            <i class=""fa fa-dollar fa-5x mb-5""></i>
                            <h4 class=""h3-responsive font-weight-bold"">
                                Za wypożyczone towary użytkownik dostaje punkty
                            </h4>
                        </li>
                    </ul>
                </div>
            </div>
            <div class=""col-md-6 text-center"">
                <div class=""col-md-12 jumbotron"">
                    <ul class=""list-unstyled mb-0"">
                        <li>
                            <i class=""fa fa-bar");
                WriteLiteral(@"-chart fa-5x mb-5""></i>
                            <h4 class=""h3-responsive font-weight-bold"">
                                Najlepsi użytkownicy pozycjonowani są w rankingach, dzięki którym mogą się wypromować
                            </h4>
                        </li>
                    </ul>
                </div>
            </div>
        </div><br>

        <div class=""row display-flex hideme"">
            <div class=""col-md-6 text-center"">
                <div class=""col-md-12 jumbotron"">
                    <ul class=""list-unstyled mb-0"">
                        <li>
                            <i class=""fa fa-calendar-check-o fa-5x mb-5""></i>
                            <h4 class=""h3-responsive font-weight-bold"">
                                Użytkownicy mogą ustalić ze sobą datę spotkania
                            </h4>
                        </li>
                    </ul>
                </div>
            </div>
            <div class=""col-md-6 text-center"">
 ");
                WriteLiteral(@"               <div class=""col-md-12 jumbotron"">
                    <ul class=""list-unstyled mb-0"">
                        <li>
                            <i class=""fa fa-lock fa-5x mb-5""></i>
                            <h4 class=""h3-responsive font-weight-bold"">
                                Transakcje wypożyczenia są bezpieczne ze względu na technologię blockchain
                            </h4>
                        </li>
                    </ul>
                </div>
            </div>
        </div><br>

    </div>


    <!-- TWÓRCY STRONY -->
    <div class=""container hideme"">
        <h2 class=""text-center"">Twórcy aplikacji: </h2>
        <div class=""row"">
            <div class=""col-md-3"">
                <div class=""card"">
                    <img class=""card-img-top"" src=""https://placehold.it/350x180"" alt=""Card image"">
                    <div class=""card-body"">
                        <h4 class=""card-title"">Aleksandra Druciak</h4>
                        <p clas");
                WriteLiteral(@"s=""card-text"">Some example text some example text. John Doe is an architect and engineer</p>
                        <a href=""#"" class=""btn btn-primary"">See Profile</a>
                    </div>
                </div>
            </div>
            <div class=""col-md-3"">
                <div class=""card"">
                    <div class=""card-body"">
                        <h4 class=""card-title"">Natalia Gąsiorowska</h4>
                        <p class=""card-text"">Some example text some example text. Jane Doe is an architect and engineer</p>
                        <a href=""#"" class=""btn btn-primary"">See Profile</a>
                    </div>
                    <img class=""card-img-bottom"" src=""https://placehold.it/350x180"" alt=""Card image"">
                </div>
            </div>
            <div class=""col-md-3"">
                <div class=""card"">
                    <img class=""card-img-top"" src=""https://placehold.it/350x180"" alt=""Card image"">
                    <div class=""card-body""");
                WriteLiteral(@">
                        <h4 class=""card-title"">Michał Krause</h4>
                        <p class=""card-text"">Some example text some example text. John Doe is an architect and engineer</p>
                        <a href=""#"" class=""btn btn-primary"">See Profile</a>
                    </div>
                </div>
            </div>
            <div class=""col-md-3"">
                <div class=""card"">
                    <div class=""card-body"">
                        <h4 class=""card-title"">Jan Żyrek</h4>
                        <p class=""card-text"">Some example text some example text. Jane Doe is an architect and engineer</p>
                        <a href=""#"" class=""btn btn-primary"">See Profile</a>
                    </div>
                    <img class=""card-img-bottom"" src=""https://placehold.it/350x180"" alt=""Card image"">
                </div>
            </div>

        </div>

    </div><br>





    <!-- Footer -->
    <footer class=""page-footer font-small indigo text-wh");
                WriteLiteral(@"ite"">
        <!-- Footer Links -->
        <div class=""container text-center text-md-left"">
            <!-- Grid row -->
            <div class=""row"">
                <!-- Grid column -->
                <div class=""col-md-3 mx-auto"">
                    <!-- Links -->
                    <h5 class=""font-weight-bold text-uppercase mt-3 mb-4"">Links</h5>
                    <ul class=""list-unstyled"">
                        <li>
                            <a class=""text-white"" href=""#!"">Very long link 1</a>
                        </li>
                        <li>
                            <a class=""text-white"" href=""#!"">Very long link 2</a>
                        </li>
                        <li>
                            <a class=""text-white"" href=""#!"">Very long link 3</a>
                        </li>
                        <li>
                            <a class=""text-white"" href=""#!"">Very long link 4</a>
                        </li>
                    </ul>
           ");
                WriteLiteral(@"     </div>
                <!-- Grid column -->
                <hr class=""clearfix w-100 d-md-none"">
                <!-- Grid column -->
                <div class=""col-md-3 mx-auto"">
                    <!-- Links -->
                    <h5 class=""font-weight-bold text-uppercase mt-3 mb-4"">Links</h5>
                    <ul class=""list-unstyled"">
                        <li>
                            <a class=""text-white"" href=""#!"">Link 1</a>
                        </li>
                        <li>
                            <a class=""text-white"" href=""#!"">Link 2</a>
                        </li>
                        <li>
                            <a class=""text-white"" href=""#!"">Link 3</a>
                        </li>
                        <li>
                            <a class=""text-white"" href=""#!"">Link 4</a>
                        </li>
                    </ul>
                </div>
                <!-- Grid column -->
                <hr class=""clearfix w-100");
                WriteLiteral(@" d-md-none"">
                <!-- Grid column -->
                <div class=""col-md-3 mx-auto"">
                    <!-- Links -->
                    <h5 class=""font-weight-bold text-uppercase mt-3 mb-4"">Links</h5>

                    <ul class=""list-unstyled"">
                        <li>
                            <a class=""text-white"" href=""#!"">Link 1</a>
                        </li>
                        <li>
                            <a class=""text-white"" href=""#!"">Link 2</a>
                        </li>
                        <li>
                            <a class=""text-white"" href=""#!"">Link 3</a>
                        </li>
                        <li>
                            <a class=""text-white"" href=""#!"">Link 4</a>
                        </li>
                    </ul>

                </div>
                <!-- Grid column -->

                <hr class=""clearfix w-100 d-md-none"">

                <!-- Grid column -->
                <div class=""col-");
                WriteLiteral(@"md-3 mx-auto"">

                    <!-- Links -->
                    <h5 class=""font-weight-bold text-uppercase mt-3 mb-4"">Links</h5>

                    <ul class=""list-unstyled"">
                        <li>
                            <a class=""text-white"" href=""#!"">Link 1</a>
                        </li>
                        <li>
                            <a class=""text-white"" href=""#!"">Link 2</a>
                        </li>
                        <li>
                            <a class=""text-white"" href=""#!"">Link 3</a>
                        </li>
                        <li>
                            <a class=""text-white"" href=""#!"">Link 4</a>
                        </li>
                    </ul>
                </div>
                <!-- Grid column -->
            </div>
            <!-- Grid row -->
        </div>
        <!-- Footer Links -->
        <!-- Copyright -->
        <div class=""footer-copyright text-center py-3 text-secondary"">
            © 2");
                WriteLiteral("018 Copyright:\r\n            <a class=\"text-white\" href=\"https://mdbootstrap.com/education/bootstrap/\"> MDBootstrap.com</a>\r\n        </div>\r\n        <!-- Copyright -->\r\n\r\n    </footer>\r\n    <!-- Footer -->\r\n\r\n");
                EndContext();
            }
            );
            __Microsoft_AspNetCore_Mvc_Razor_TagHelpers_BodyTagHelper = CreateTagHelper<global::Microsoft.AspNetCore.Mvc.Razor.TagHelpers.BodyTagHelper>();
            __tagHelperExecutionContext.Add(__Microsoft_AspNetCore_Mvc_Razor_TagHelpers_BodyTagHelper);
            await __tagHelperRunner.RunAsync(__tagHelperExecutionContext);
            if (!__tagHelperExecutionContext.Output.IsContentModified)
            {
                await __tagHelperExecutionContext.SetOutputContentAsync();
            }
            Write(__tagHelperExecutionContext.Output);
            __tagHelperExecutionContext = __tagHelperScopeManager.End();
            EndContext();
            BeginContext(13889, 11, true);
            WriteLiteral("\r\n</html>\r\n");
            EndContext();
        }
        #pragma warning restore 1998
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.ViewFeatures.IModelExpressionProvider ModelExpressionProvider { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IUrlHelper Url { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.IViewComponentHelper Component { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IJsonHelper Json { get; private set; }
        [global::Microsoft.AspNetCore.Mvc.Razor.Internal.RazorInjectAttribute]
        public global::Microsoft.AspNetCore.Mvc.Rendering.IHtmlHelper<dynamic> Html { get; private set; }
    }
}
#pragma warning restore 1591

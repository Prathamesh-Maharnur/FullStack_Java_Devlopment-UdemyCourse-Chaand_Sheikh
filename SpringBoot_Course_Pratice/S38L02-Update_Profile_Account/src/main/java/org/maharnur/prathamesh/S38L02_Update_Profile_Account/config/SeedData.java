package org.maharnur.prathamesh.S38L02_Update_Profile_Account.config;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.maharnur.prathamesh.S38L02_Update_Profile_Account.models.Account;
import org.maharnur.prathamesh.S38L02_Update_Profile_Account.models.Authority;
import org.maharnur.prathamesh.S38L02_Update_Profile_Account.models.Post;
import org.maharnur.prathamesh.S38L02_Update_Profile_Account.services.AccountService;
import org.maharnur.prathamesh.S38L02_Update_Profile_Account.services.AuthorityService;
import org.maharnur.prathamesh.S38L02_Update_Profile_Account.services.PostService;
import org.maharnur.prathamesh.S38L02_Update_Profile_Account.util.constants.Privileges;
import org.maharnur.prathamesh.S38L02_Update_Profile_Account.util.constants.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @Autowired
    private AuthorityService authorityService;

    @Override
    public void run(String... args) throws Exception {

        for(Privileges auth: Privileges.values()){
            Authority authority = new Authority();
            authority.setId(auth.getId());
            authority.setName(auth.getPrivilege());
            authorityService.save(authority);
        }

        Account account01 = new Account();
        Account account02 = new Account();
        Account account03 = new Account();
        Account account04 = new Account();

        account01.setEmail("user@user.com");
        account01.setPassword("pass987");
        account01.setFirstname("User");
        account01.setLastname("lastname");
        account01.setAge(25);
        account01.setDate_of_birth(LocalDate.parse("1990-01-01"));
        account01.setGender("Male");


        account02.setEmail("admin@admin.com");
        account02.setPassword("pass987");
        account02.setFirstname("Admin");
        account02.setLastname("lastname");
        account02.setRole(Role.ADMIN.getRole());
        account02.setAge(25);
        account02.setDate_of_birth(LocalDate.parse("1990-01-01"));
        account02.setGender("Female");

        account03.setEmail("editor@editor.com");
        account03.setPassword("pass987");
        account03.setFirstname("Editor");
        account03.setLastname("lastname");
        account03.setRole(Role.EDITOR.getRole());
        account03.setAge(55);
        account03.setDate_of_birth(LocalDate.parse("1975-01-01"));
        account03.setGender("Male");

        account04.setEmail("super_editor@editor.com");
        account04.setPassword("pass987");
        account04.setFirstname("Editor");
        account04.setLastname("lastname");
        account04.setRole(Role.EDITOR.getRole());
        account04.setAge(40);
        account04.setDate_of_birth(LocalDate.parse("1980-01-01"));
        account04.setGender("Female");
        
        Set<Authority> authorities = new HashSet<>();
        authorityService.findById(Privileges.ACCESS_ADMIN_PANEL.getId()).ifPresent(authorities::add);
        authorityService.findById(Privileges.RESET_ANY_USER_PASSWORD.getId()).ifPresent(authorities::add);
        account04.setAuthorities(authorities);


        accountService.save(account01);
        accountService.save(account02);
        accountService.save(account03);
        accountService.save(account04);

       List<Post> posts = postService.getAll();
       if(posts.size() == 0){
        Post post01 = new Post();
        Post post02 = new Post();

        post01.setTitle("About Git");
        post01.setBody("""
                Git (/ɡɪt/ ⓘ[9]) is a distributed version control software system[10] that is capable of managing versions of source code or data. It is often used to control source code by programmers who are developing software collaboratively.

                Design goals of Git include speed, data integrity, and support for distributed, non-linear workflows—thousands of parallel branches running on different computers.[11][12][13]

                As with most other distributed version control systems, and unlike most client–server systems, Git maintains a local copy of the entire repository, also known as the "repo", with history and version-tracking abilities, independent of network access or a central server. A repository is stored on each computer in a standard directory with additional, hidden files to provide version control capabilities.[14] Git provides features to synchronize changes between repositories that share history; for asynchronous collaboration, this extends to repositories on remote machines. Although all repositories (with the same history) are peers, developers often use a central server to host a repository to hold an integrated copy.

                Git is free and open-source software shared under the GPL-2.0-only license.

                Git was originally created by Linus Torvalds for version control in the development of the Linux kernel.[15] The trademark "Git" is registered by the Software Freedom Conservancy.

                Today, Git is the version control system most commonly used by software developers. It is the most popular distributed version control system,[16][17] with nearly 95% of developers reporting it as their primary version control system as of 2022.[18] It is the most widely used source-code management tool among professional developers. There are offerings of Git repository services, including GitHub, SourceForge, Bitbucket and GitLab.[19][20][21][22][23]
        """);
        post01.setAccount(account01);
        postService.save(post01);

        
        post02.setTitle("Spring Boot Model View Controller framework");
        post02.setBody("""
                      
              <h3><strong>Model–view–controller framework</strong></h3>
              <p><a href="https://en.wikipedia.org/wiki/File:Spring5JuergenHoeller2.jpg"><img alt="File:Spring5JuergenHoeller2.jpg" src="//upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Spring5JuergenHoeller2.jpg/960px-Spring5JuergenHoeller2.jpg" decoding="async" width="330" height="150vw" srcset="//upload.wikimedia.org/wikipedia/commons/thumb/7/7b/Spring5JuergenHoeller2.jpg/1920px-Spring5JuergenHoeller2.jpg 2x" data-file-width="4928" data-file-height="3264"></a></p><p>&nbsp;</p><p>Spring MVC/Web Reactive presentation given by Jürgen Höller</p><p>The Spring Framework features its own <a href="https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller">model–view–controller</a> (MVC) <a href="https://en.wikipedia.org/wiki/Web_application_framework">web application framework</a>, which was not originally planned. The Spring developers decided to write their own Web framework as a reaction to what they perceived as the poor design of the (then) popular <a href="https://en.wikipedia.org/wiki/Jakarta_Struts">Jakarta Struts</a> Web framework,<a href="https://en.wikipedia.org/wiki/Spring_Framework#cite_note-21">[21]</a> as well as deficiencies in other available frameworks. In particular, they felt there was insufficient separation between the presentation and request handling layers, and between the request handling layer and the model.<a href="https://en.wikipedia.org/wiki/Spring_Framework#cite_note-22">[22]</a></p><p>Like Struts, Spring MVC is a request-based framework. The framework defines <a href="https://en.wikipedia.org/wiki/Strategy_pattern">strategy</a> interfaces for all of the responsibilities that must be handled by a modern request-based framework. The goal of each interface is to be simple and clear so that it's easy for Spring MVC users to write their own implementations, if they so choose. MVC paves the way for cleaner front end code. All interfaces are tightly coupled to the <a href="https://en.wikipedia.org/wiki/Java_Servlet">Servlet API</a>. This tight coupling to the Servlet API is seen by some as a failure on the part of the Spring developers to offer a high-level abstraction for Web-based applications[<a href="https://en.wikipedia.org/wiki/Wikipedia:Citation_needed"><i>citation needed</i></a>]. However, this coupling makes sure that the features of the Servlet API remain available to developers while also offering a high abstraction framework to ease working with it.</p><p>The DispatcherServlet class is the <a href="https://en.wikipedia.org/wiki/Front_controller">front controller</a><a href="https://en.wikipedia.org/wiki/Spring_Framework#cite_note-23">[23]</a> of the framework and is responsible for delegating control to the various interfaces during the execution phases of an <a href="https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol">HTTP request</a>.</p><p>The most important interfaces defined by Spring MVC, and their responsibilities, are listed below:</p><ul><li>Controller: comes between Model and View to manage incoming requests and redirect to proper response. Controller will map the http request to corresponding methods. It acts as a gate that directs the incoming information. It switches between going into model or view.</li><li>HandlerAdapter: execution of objects that handle incoming requests</li><li>HandlerInterceptor: interception of incoming requests comparable, but not equal to Servlet filters (use is optional and not controlled by DispatcherServlet).</li><li>HandlerMapping: selecting objects that handle incoming requests (handlers) based on any attribute or condition internal or external to those requests</li><li>LocaleResolver: resolving and optionally saving of the <a href="https://en.wikipedia.org/wiki/Locale_(computer_software)">locale</a> of an individual user</li><li>MultipartResolver: facilitate working with file uploads by wrapping incoming requests</li><li>View: responsible for returning a response to the client. Some requests may go straight to view without going to the model part; others may go through all three.</li><li>ViewResolver: selecting a View based on a logical name for the view (use is not strictly required)</li></ul><p>Each strategy interface above has an important responsibility in the overall framework. The abstractions offered by these interfaces are powerful, so to allow for a set of variations in their implementations, Spring MVC ships with implementations of all these interfaces and together offers a feature set on top of the Servlet API. However, developers and vendors are free to write other implementations. Spring MVC uses the Java java.util.Map interface as a data-oriented abstraction for the Model where keys are expected to be string values.</p><p>The ease of testing the implementations of these interfaces seems one important advantage of the high level of abstraction offered by Spring MVC. DispatcherServlet is tightly coupled to the Spring inversion of control container for configuring the web layers of applications. However, web applications can use other parts of the Spring Framework—including the container—and choose not to use Spring MVC.</p>
            
            """);
        post02.setAccount(account02);
        postService.save(post02);
        
       }
    }

}

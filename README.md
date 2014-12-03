# windup.jboss.org

## Getting Started
This section covers the steps you need to do in order to setup your environment and get the site running for the first time. Further sections cover the details.

1. Configure environment variables needed for the site. 

    Currently no environment variables are needed!

2. Configure the software.
    _NOTE:_ You must use a version of Ruby installed via RVM.
    * Install RVM from here http://rvm.io if you don't already have it.
    * [upgrade RVM](http://rvm.io/rvm/upgrading).
    * Install the correct Ruby version (See [here](http://stackoverflow.com/questions/22605921/fresh-installs-of-rvm-and-ruby-2-1-1-dyld-library-pathing-error) for details on why '--disable-binary' is needed):

            rvm install ruby-2.1.2 --disable-binary
            
    * If you see the `Error running 'requirements_osx_brew_libs_install autoconf automake libtool pkg-config libyaml readline libksba openssl'` error message, you may need to run the following, and then retry the above install command:
    
            rvm requirements
            
    * Install any required supporting software. For example, on Fedora you may need to:

            sudo yum install -y rubygem-nokogiri
            sudo yum install -y gcc ruby-devel libxml2 libxml2-devel libxslt libxslt-devel
            sudo sysctl fs.inotify.max_user_watches=524288
            sudo sysctl -p
3. Fork the project, then clone your fork and add the upstream repository.
 
         git clone git@github.com:YOUR_USER_NAME/windup.jboss.org.git
         cd windup.jboss.org
         git remote add -f upstream git@github.com:jboss-developer/windup.jboss.org.git

4. Bootstrap the environment (only needed the first time)
        
        bundle install

5. Configure the enviornment:

        rake setup

6. Build the site for display at <http://localhost:4242>
        rake clean preview

_NOTE_ The site will take a long time to build for the first time (10 minutes+). Subsequent builds are much quicker.

If the build was successful, you should be able to visit the site here: <http://localhost:4242>


## Development

If you are working on the CSS, make sure to also run `compass watch`

New pages should be added to the root with the extension `.html.slim`

## Deployment

Run `rake deploy[staging]` or `rake deploy[production]`

To run in Awestruct in development mode, execute:

`rake`

To run Awestruct while developing, execute:

`rake preview`

To clean the generated site before you build, execute:

`rake clean preview`

To deploy using the production profile, execute:

`rake deploy`

To get a list of all tasks, execute:

`rake -T`

Now you're Awestruct with rake!

## Common issues
This area documents fixes to common issues:


### "Too many open files"
This can be caused by running out of file descriptors. Currently only seen on Macs. See the following for how to fix: http://superuser.com/questions/433746/is-there-a-fix-for-the-too-many-open-files-in-system-error-on-os-x-10-7-1

### "An error occurred: getaddrinfo: nodename nor servname provided, or not known"
Same fix as "Too many open files"

### "Unable to decrypt vault (GPGME::Error::BadPassphrase)" 
If using GNU PGP, sometimes you're not presented with a popup asking for the passphrase. This will result in the following error being presented:  `Unable to decrypt vault (GPGME::Error::BadPassphrase)`.
To fix, use the instructions in the following url:
https://www.gnupg.org/documentation/manuals/gnupg/Invoking-GPG_002dAGENT.html

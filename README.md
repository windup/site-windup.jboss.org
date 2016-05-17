# Windup Web Upload Instructions

The [windup.jboss.org](http://windup.jboss.org) web site is hosted by Red Hat / JBoss.org

## Configure Your Environment

### Get the Source Code

The source code for [windup.jboss.org](http://windup.jboss.org) is currently located at https://github.com/windup/windup.jboss.org.

1. [Fork](https://github.com/windup/windup.jboss.org/fork) the windup.jboss.org project. This creates the `windup.jboss.org` project in your own Git with the default remote name 'origin'.
1. Clone your fork. This creates and populates a `windup.jboss.org` directory in your local file system.

    ```
    git clone https://github.com/<your-username>/windup.jboss.org.git
    ```

1. Navigate to the `windup.jboss.org` directory, then add and fetch the `upstream` repository so you can update your git with any changes.

    ```
    git remote add -f upstream git@github.com:windup/windup.jboss.org.git
    ```

### Request Write Access to the Web Site Remote Server

The [windup.jboss.org](http://windup.jboss.org) web site is hosted on the `filemgmt.jboss.org` remote server. Follow these steps to request write access.

1. Send an email to eng-ops@redhat.com requesting write access to `filemgmt.jboss.org` for `windup.jboss.org`.
1. Attach your ssh public key to the email request.
1. When you receive confirmation, you can test access in a terminal with the following command. If you are prompted for a password, you do not have proper access.

    ```
    sftp windup@filemgmt.jboss.org
    ```


## Update the Web Site

### Make the Code Updates

1. Checkout a branch to work in.
1. Update the files as needed.
1. Commit the changes.
1. Push the changes to your forked repository.
1. Request a merge to the upstream repository and merge the changes.

### Push Updates to the Web Site Remote Server

Use `sftp` to transfer files to the remote server. You an use linux commands to navigate on the remote file system. Use the same commands with an 'l' prefix to navigate to the files on your local file system.

The following example assumes you have modified the `windup.jboss.org/assets/windup.js` file, committed the change, and pushed it to the upstream repository.

1. Log into the remote server and navigate to the `www_htdocs/windup/` directory on the remote server.

    ```
    $ sftp windup@filemgmt.jboss.org
    sftp> cd www_htdocs/windup
    ```

1. Use the `lcd` command to navigate to the directory containing your updates on your local machine. You can verify the path on the local machine using the `lpwd` command. For example:

    ```
    sftp> lcd ~/windup.jboss.org/assets/js
    sftp> lpwd
    Local working directory: /home/username/windup.jboss.org/assets/js
    ```
1. Use the `cd` command to navigate to the corresponding directory on the remote server. You can verify the path on the remote machine using the `pwd` command.

    ```
    sftp> cd www_htdocs/windup/assets/js/
    sftp> pwd
    Remote working directory: /www_htdocs/windup/assets/js
    ```
1. Upload the modified file to the remote server.

    ```
    sftp> put windup.js
    Uploading windup.js to /www_htdocs/windup/assets/js/windup.js
    windup.js                                        100% 1316     1.3KB/s   00:00
    ```
1. Test the change on [windup.jboss.org](http://windup.jboss.org).

### Push the Rule Schema to the Web Site Remote Server

*_Upload Schema Example_*

```
### sftp into the remote repository
sftp windup@filemgmt.jboss.org

### Navigate to the remote schema directory
sftp> cd www_htdocs/windup/schema/

### Navigate to the local directory containing the schema
sftp> lcd /home/username/windup/config-xml/schema

### Push the schema to the remote repository
sftp> put windup-jboss-ruleset.xsd

### You should see "Uploading  windup-jboss-ruleset.xsd to /www_htdocs/windup/schema/ windup-jboss-ruleset.xsd"
windup-jboss-ruleset.xsd  100%   10KB   9.9KB/s   00:00

### Exit sftp
sftp> exit
```

Use your favorite browser to browse to http://windup.jboss.org/schema/windup-jboss-ruleset.xsd

## Additional Help

* Type `man sftp` for a list of commands.
* https://access.redhat.com/documentation/en-US/Red_Hat_Enterprise_Linux/6/html-single/Deployment_Guide/index.html#s2-ssh-clients-sftp
* http://www.tecmint.com/sftp-command-examples/
* https://docs.oracle.com/cd/E26502_01/html/E29001/remotehowtoaccess-14.html


# hibernate-search
https://docs.jboss.org/hibernate/stable/search/reference/en-US/html_single/#search-configuration-directory
```
hibernate.search.default.directory_provider
```
option :
    -filesystem
    -Filesystem-master 
    -filesystem-slave 
    -infinispan 

Filesystem-master/filesystem-slave and infinispan are noteworthy for clustered applications, where the index has to be synchronized between nodes.

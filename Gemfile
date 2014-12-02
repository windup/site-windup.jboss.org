# Gemfile
source "https://rubygems.org"

# Platform helpers
def windows_only(require_as)
  RbConfig::CONFIG['host_os'] =~ /mingw|mswin/i ? require_as : false
end
def linux_only(require_as)
  RbConfig::CONFIG['host_os'] =~ /linux/ ? require_as : false
end
def darwin_only(require_as)
  RbConfig::CONFIG['host_os'] =~ /darwin/ ? require_as : false
end
 
# GEMS
gem 'awestruct', '~> 0.5.6.beta4'
gem 'slim', '~> 2.0.0'
gem 'kramdown', '~> 1.0.1'
gem 'asciidoctor', '~> 1.5.0'
gem 'uglifier', '~> 2.0.1'
gem 'htmlcompressor', '~> 0.0.6'

group :development do
  gem 'rb-inotify', require: false
  gem 'rb-fsevent', require: false
  gem 'rb-fchange', require: false
  gem 'rake', '~> 10.0.4'
  #gem 'pry', require: false
  #gem 'pry-byebug', require: false
  #gem 'pry-stack_explorer', require: false
  #gem 'pry-exception_explorer', require: false
end


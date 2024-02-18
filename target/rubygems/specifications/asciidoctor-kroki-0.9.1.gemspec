# -*- encoding: utf-8 -*-
# stub: asciidoctor-kroki 0.9.1 ruby lib

Gem::Specification.new do |s|
  s.name = "asciidoctor-kroki".freeze
  s.version = "0.9.1"

  s.required_rubygems_version = Gem::Requirement.new(">= 0".freeze) if s.respond_to? :required_rubygems_version=
  s.metadata = { "bug_tracker_uri" => "https://github.com/ggrossetie/asciidoctor-kroki/issues", "rubygems_mfa_required" => "true", "source_code_uri" => "https://github.com/ggrossetie/asciidoctor-kroki" } if s.respond_to? :metadata=
  s.require_paths = ["lib".freeze]
  s.authors = ["Guillaume Grossetie".freeze]
  s.date = "2023-10-11"
  s.description = "An extension for Asciidoctor to convert diagrams to images using https://kroki.io".freeze
  s.email = ["ggrossetie@yuzutech.fr".freeze]
  s.homepage = "https://github.com/ggrossetie/asciidoctor-kroki".freeze
  s.licenses = ["MIT".freeze]
  s.rubygems_version = "3.3.26".freeze
  s.summary = "Asciidoctor extension to convert diagrams to images using Kroki".freeze

  s.installed_by_version = "3.3.26" if s.respond_to? :installed_by_version

  if s.respond_to? :specification_version then
    s.specification_version = 4
  end

  if s.respond_to? :add_runtime_dependency then
    s.add_runtime_dependency(%q<asciidoctor>.freeze, ["~> 2.0"])
    s.add_development_dependency(%q<rake>.freeze, ["~> 13.0.6"])
    s.add_development_dependency(%q<rspec>.freeze, ["~> 3.10.0"])
    s.add_development_dependency(%q<rubocop>.freeze, ["~> 1.30"])
  else
    s.add_dependency(%q<asciidoctor>.freeze, ["~> 2.0"])
    s.add_dependency(%q<rake>.freeze, ["~> 13.0.6"])
    s.add_dependency(%q<rspec>.freeze, ["~> 3.10.0"])
    s.add_dependency(%q<rubocop>.freeze, ["~> 1.30"])
  end
end

# Generated by Django 3.0.3 on 2020-04-13 10:48

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('streampage', '0009_auto_20200413_1036'),
    ]

    operations = [
        migrations.RenameModel(
            old_name='PostsMeta',
            new_name='PostsMetaHash',
        ),
    ]
